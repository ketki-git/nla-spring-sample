package com.nla.sample.dao;

import java.util.List;

import com.nla.sample.model.Book;
import com.nla.sample.model.Customer;

public interface CustomerDao {

	Customer findByCustomerId(long customerId);

	List<Customer> findAllCustomers();

	List<Book> findBorrowedBooks(long customerId);
}
