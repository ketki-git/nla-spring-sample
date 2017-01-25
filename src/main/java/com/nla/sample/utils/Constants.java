package com.nla.sample.utils;

public class Constants {
	private Constants() {
	}

	public static final String SQL_FIND_ALL_CUSTOMERS = "SELECT * FROM CUSTOMER";
	public static final String SQL_FIND_BY_CUSTOMER_ID = "SELECT * FROM CUSTOMER WHERE CUSTOMER_ID = ?";

	public static final String SQL_FIND_BY_BOOK_ID = "SELECT * FROM BOOK WHERE BOOK_ID = ?";
	public static final String SQL_FIND_ALL_BOOKS = "SELECT * FROM BOOK";
	public static final String SQL_FIND_BORROWED_BOOKS = "SELECT * FROM BOOK WHERE BOOK_BORROWER_ID = ?";
}
