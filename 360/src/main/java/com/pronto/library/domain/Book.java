package com.pronto.library.domain;

import java.math.BigDecimal;

public class Book {

	private Long id;
	
	private String title;
	
	private String isbn;
	
	private Author author;
	
	private BigDecimal price;
	
	private boolean cdAvailable;

	private int quantity;

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public boolean isCdAvailable() {
		return cdAvailable;
	}

	public void setCdAvailable(boolean cdAvailable) {
		this.cdAvailable = cdAvailable;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}
}
