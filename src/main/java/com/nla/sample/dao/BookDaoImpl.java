package com.nla.sample.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

import com.nla.sample.mapper.BookMapper;
import com.nla.sample.mapper.CustomerMapper;
import com.nla.sample.model.Book;
import com.nla.sample.model.Customer;
import com.nla.sample.utils.Constants;

/**
 * Implementation of BookDao interface
 * 
 * @author Ketki
 *
 */
public class BookDaoImpl implements BookDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	/**
	 * Get the book of given id
	 * 
	 * @param bookId
	 * @return
	 */
	public Book findByBookId(long bookId) {
		try {
			Book book = jdbcTemplate.queryForObject(Constants.SQL_FIND_BY_BOOK_ID, new BookMapper(),
					new Object[] { bookId });
			return book;
		} catch (DataAccessException $e) {
			System.out.println("data access exception in BookDaoImpl class");
			return null;
		}

	}

	/**
	 * Find all books from the database
	 * 
	 * @return
	 */
	public List<Book> findAllBooks() {
		List<Book> books = jdbcTemplate.query(Constants.SQL_FIND_ALL_BOOKS, new BookMapper());
		return books;
	}

	/**
	 * Get the details of the customer who has borrowed a book
	 * 
	 * @param bookId
	 * @return
	 */
	public Customer viewBorrower(long bookId) {
		Book book = this.findByBookId(bookId);

		if (book != null) {
			Customer customer = jdbcTemplate.queryForObject(Constants.SQL_FIND_BY_CUSTOMER_ID, new CustomerMapper(),
					new Object[] { book.getBorrowerId() });
			return customer;
		} else {
			return null;
		}
	}

}
