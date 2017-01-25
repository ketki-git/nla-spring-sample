package com.nla.sample.model;

public class Book {
	String title;
	String author;
	String bookInfo;
	Long id;
	Long borrowerId;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBookInfo() {
		return this.bookInfo;
	}

	public void setBookInfo(String bookInfo) {
		this.bookInfo = bookInfo;
	}

	public void setBorrowerId(long borrowerId) {
		this.borrowerId = borrowerId;
	}

	public long getBorrowerId() {
		return this.borrowerId;
	}

	@Override
	public String toString() {
		return "[ Book Id : " + id + ", Book title : " + title + ", Author : " + author + ", Book Info : " + bookInfo
				+ "]";
	}
}
