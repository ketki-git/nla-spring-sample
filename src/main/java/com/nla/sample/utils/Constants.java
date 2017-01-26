package com.nla.sample.utils;

public class Constants {
	private Constants() {
	}

	public static final String SQL_FIND_ALL_CUSTOMERS = "SELECT * FROM CUSTOMER";
	public static final String SQL_FIND_BY_CUSTOMER_ID = "SELECT * FROM CUSTOMER WHERE CUSTOMER_ID = ?";

	public static final String SQL_FIND_BY_BOOK_ID = "SELECT * FROM BOOK b, BOOK_INFO bi WHERE b.BOOK_ID = bi.BOOK_ID AND b.BOOK_ID = ?";
	public static final String SQL_FIND_ALL_BOOKS = "SELECT * FROM BOOK b, BOOK_INFO bi WHERE b.BOOK_ID = bi.BOOK_ID";
	public static final String SQL_FIND_BORROWED_BOOKS = "SELECT * FROM BOOK b, BOOK_INFO bi WHERE b.BOOK_ID = bi.BOOK_ID AND b.BOOK_BORROWER_ID = ?";
}
