package com.nla.sample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nla.sample.dao.BookDao;
import com.nla.sample.model.Book;
import com.nla.sample.model.Customer;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookDao bookDao;

	public Book findByBookId(long bookId) {
		return bookDao.findByBookId(bookId);
	}

	public List<Book> findAllBooks() {
		return bookDao.findAllBooks();
	}

	public BookDao getBookDao() {
		return bookDao;
	}

	public void setBookDao(BookDao bookDao) {
		this.bookDao = bookDao;
	}

	public Customer viewBorrower(long bookId) {
		return bookDao.viewBorrower(bookId);
	}

}