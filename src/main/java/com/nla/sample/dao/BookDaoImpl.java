package com.nla.sample.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.nla.sample.mapper.BookMapper;
import com.nla.sample.mapper.CustomerMapper;
import com.nla.sample.model.Book;
import com.nla.sample.model.Customer;
import com.nla.sample.utils.Constants;

public class BookDaoImpl implements BookDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public Book findByBookId(long bookId) {
		Book book = jdbcTemplate.queryForObject(Constants.SQL_FIND_BY_BOOK_ID, new BookMapper(),
				new Object[] { bookId });
		return book;
	}

	public List<Book> findAllBooks() {
		List<Book> books = jdbcTemplate.query(Constants.SQL_FIND_ALL_BOOKS, new BookMapper());
		return books;
	}

	public Customer viewBorrower(long bookId) {
		Book book = this.findByBookId(bookId);
		Customer customer = jdbcTemplate.queryForObject(Constants.SQL_FIND_BY_CUSTOMER_ID, new CustomerMapper(),
				new Object[] { book.getBorrowerId() });
		return customer;
	}

}
