package com.nla.sample.service;

import java.util.List;

import com.nla.sample.model.Book;
import com.nla.sample.model.Customer;

public interface CustomerService {

	Customer findByCustomerId(long customerId);

	List<Customer> findAllCustomers();

	List<Book> findBorrowedBooks(long customerId);
}
