package com.nla.sample.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.nla.sample.mapper.BookMapper;
import com.nla.sample.mapper.CustomerMapper;
import com.nla.sample.model.Book;
import com.nla.sample.model.Customer;
import com.nla.sample.utils.Constants;

public class CustomerDaoImpl implements CustomerDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public Customer findByCustomerId(long customerId) {
		Customer customer = jdbcTemplate.queryForObject(Constants.SQL_FIND_BY_CUSTOMER_ID, new CustomerMapper(),
				new Object[] { customerId });
		return customer;
	}

	public List<Customer> findAllCustomers() {
		List<Customer> customers = jdbcTemplate.query(Constants.SQL_FIND_ALL_CUSTOMERS, new CustomerMapper());
		return customers;
	}

	public List<Book> findBorrowedBooks(long customerId) {
		List<Book> books = jdbcTemplate.query(Constants.SQL_FIND_BORROWED_BOOKS, new BookMapper(),
				new Object[] { customerId });
		return books;
	}

}
