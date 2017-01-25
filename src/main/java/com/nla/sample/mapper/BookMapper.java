package com.nla.sample.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.nla.sample.model.Book;

public class BookMapper implements RowMapper<Book> {

	public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
		Book book = new Book();
		book.setId(rs.getLong("BOOK_ID"));
		book.setTitle(rs.getString("BOOK_NAME"));
		book.setAuthor(rs.getString("BOOK_AUTHOR"));
		book.setBookInfo(rs.getString("BOOK_INFO"));
		book.setBorrowerId(rs.getLong("BOOK_BORROWER_ID"));
		return book;
	}

}