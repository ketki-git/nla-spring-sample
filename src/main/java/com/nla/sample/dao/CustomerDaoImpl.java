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
 * Implementation of CustomerDao interface
 * 
 * @author Ketki
 *
 */
public class CustomerDaoImpl implements CustomerDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	/**
	 * Finds customer by customer id
	 * 
	 * @param customerId
	 * @return Customer
	 */
	public Customer findByCustomerId(long customerId) {

		try {
			Customer customer = jdbcTemplate.queryForObject(Constants.SQL_FIND_BY_CUSTOMER_ID, new CustomerMapper(),
					new Object[] { customerId });
			return customer;
		} catch (DataAccessException e) {
			System.out.println("Data access exception in CustomerDaoImpl class");
			return null;
		}
	}

	/**
	 * Return list of all customers
	 * 
	 * @return
	 */
	public List<Customer> findAllCustomers() {
		List<Customer> customers = jdbcTemplate.query(Constants.SQL_FIND_ALL_CUSTOMERS, new CustomerMapper());
		return customers;
	}

	/**
	 * Return list of all books borrowed by a customer
	 * 
	 * @param customerId
	 * @return
	 */
	public List<Book> findBorrowedBooks(long customerId) {
		List<Book> books = jdbcTemplate.query(Constants.SQL_FIND_BORROWED_BOOKS, new BookMapper(),
				new Object[] { customerId });
		return books;
	}

}
