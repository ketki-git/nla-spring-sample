package com.nla.sample.service;

import java.util.List;

import com.nla.sample.model.Book;
import com.nla.sample.model.Customer;

/**
 * The BookService is simply a pass-through to the data access layer, but it is
 * added for two reasons: 1) It provides a layer of abstraction between the
 * application and the data access layer 2) It provides a place to add
 * additional real business logic or business rules
 * 
 * @author Ketki
 *
 */
public interface BookService {

	Book findByBookId(long bookId);

	List<Book> findAllBooks();

	Customer viewBorrower(long bookId);
}
