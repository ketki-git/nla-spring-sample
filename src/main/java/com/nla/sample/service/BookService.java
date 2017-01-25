package com.nla.sample.service;

import java.util.List;

import com.nla.sample.model.Book;
import com.nla.sample.model.Customer;

public interface BookService {

	Book findByBookId(long bookId);

	List<Book> findAllBooks();

	Customer viewBorrower(long bookId);
}
