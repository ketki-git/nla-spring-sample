package com.nla.sample.webapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.nla.sample.model.Book;
import com.nla.sample.model.Customer;
import com.nla.sample.service.BookService;
import com.nla.sample.service.CustomerService;

/**
 * 
 * @author Ketki
 *
 */
@Controller
public class IndexController {

	private CustomerService customerService;
	private BookService bookService;

	@Autowired
	private ApplicationContext appContext;

	/**
	 * Page to display when top level URL is accessed
	 * 
	 * @return
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView index() {
		return books();
	}

	/**
	 * Returns list of all available books in the database
	 * 
	 * @return
	 */
	@RequestMapping(value = "/books", method = RequestMethod.GET)
	public ModelAndView books() {

		if (bookService == null) {
			bookService = appContext.getBean("bookService", BookService.class);
		}

		List<Book> books = bookService.findAllBooks();

		ModelAndView model = new ModelAndView("books");
		model.addObject("booklist", books);

		return model;
	}

	/**
	 * Returns specific book details
	 * 
	 * @param bookId
	 * @return
	 */
	@RequestMapping(value = "/book/{bookId}", method = RequestMethod.GET)
	public ModelAndView book(@PathVariable String bookId) {

		if (customerService == null) {
			customerService = appContext.getBean("customerService", CustomerService.class);
		}

		if (bookService == null) {
			bookService = appContext.getBean("bookService", BookService.class);
		}

		ModelAndView model = new ModelAndView("book");

		if (bookId != null) {

			Customer borrower = bookService.viewBorrower(Long.parseLong(bookId));
			Book book = bookService.findByBookId(Long.parseLong(bookId));

			model.addObject("borrower", borrower);
			model.addObject("book", book);
		}

		return model;
	}

	/**
	 * Returns list of all customers/borrowers
	 * 
	 * @return
	 */
	@RequestMapping(value = "/borrowers", method = RequestMethod.GET)
	public ModelAndView borrowers() {

		if (customerService == null) {
			customerService = appContext.getBean("customerService", CustomerService.class);
		}

		List<Customer> customers = customerService.findAllCustomers();

		ModelAndView model = new ModelAndView("borrowers");
		model.addObject("customers", customers);

		return model;
	}

	/**
	 * Returns details of a customer/borrower
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/borrower/{id}", method = RequestMethod.GET)
	public ModelAndView borrower(@PathVariable String id) {

		if (customerService == null) {
			customerService = appContext.getBean("customerService", CustomerService.class);
		}

		if (bookService == null) {
			bookService = appContext.getBean("bookService", BookService.class);
		}

		Customer customer = customerService.findByCustomerId(Long.parseLong(id));
		List<Book> booksBorrowed = customerService.findBorrowedBooks(Long.parseLong(id));

		// return back to index.jsp
		ModelAndView model = new ModelAndView("borrower");
		model.addObject("borrower", customer);
		model.addObject("booksBorrowed", booksBorrowed);

		return model;
	}

}
