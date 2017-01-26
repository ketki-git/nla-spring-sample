package com.nla.sample.dao;

import java.util.List;

import com.nla.sample.model.Book;
import com.nla.sample.model.Customer;

/**
 * Data access object for customers
 * 
 * @author Ketki
 *
 */
public interface CustomerDao {

	/**
	 * Finds customer by customer id
	 * 
	 * @param customerId
	 * @return Customer
	 */
	Customer findByCustomerId(long customerId);

	/**
	 * Return list of all customers
	 * 
	 * @return
	 */
	List<Customer> findAllCustomers();

	/**
	 * Return list of all books borrowed by a customer
	 * 
	 * @param customerId
	 * @return
	 */
	List<Book> findBorrowedBooks(long customerId);
}
