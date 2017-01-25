package com.nla.sample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nla.sample.dao.CustomerDao;
import com.nla.sample.model.Book;
import com.nla.sample.model.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDao customerDao;

	public Customer findByCustomerId(long customerId) {
		return customerDao.findByCustomerId(customerId);
	}

	public List<Customer> findAllCustomers() {
		return customerDao.findAllCustomers();
	}

	public CustomerDao getCustomerDao() {
		return customerDao;
	}

	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}

	public List<Book> findBorrowedBooks(long customerId) {
		return customerDao.findBorrowedBooks(customerId);
	}

}