package com.nla.sample.dao;

import java.util.List;

import com.nla.sample.model.Book;
import com.nla.sample.model.Customer;

public interface BookDao {

	Book findByBookId(long bookId);

	List<Book> findAllBooks();

	Customer viewBorrower(long bookId);
}
