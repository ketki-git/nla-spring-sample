package com.nla.sample.dao;

import java.util.List;

import com.nla.sample.model.Book;
import com.nla.sample.model.Customer;

/**
 * Data access object for books
 * 
 * @author Ketki
 *
 */
public interface BookDao {

	/**
	 * Get the book of given id
	 * 
	 * @param bookId
	 * @return
	 */
	Book findByBookId(long bookId);

	/**
	 * Find all books from the database
	 * 
	 * @return
	 */
	List<Book> findAllBooks();

	/**
	 * Get the details of the customer who has borrowed a book
	 * 
	 * @param bookId
	 * @return
	 */
	Customer viewBorrower(long bookId);
}
