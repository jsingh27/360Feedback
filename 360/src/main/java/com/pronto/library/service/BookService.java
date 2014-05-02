package com.pronto.library.service;
import com.pronto.library.domain.Book;

public class BookService {

	/**
	 * This is a farzi implementation
	 * @param bookId
	 * @return
	 */
	public Book findBookById(Long bookId) {
		Book book = new Book();
		book.setId(bookId);
		//find the book from database
		return book;
	}
}
