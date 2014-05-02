package com.pronto.library.service;

import com.pronto.library.domain.Book;
import com.pronto.library.domain.Student;

public class LibraryService {

	public boolean issueBook(Long bookId, Long studentId) {

		BookService bookService = new BookService();
		Book book = bookService.findBookById(bookId);

		StudentService studentService = new StudentService();
		Student student = studentService.findStudentById(studentId);
		
		if(book.getQuantity() <= 0) {
			return false;
		}
		
		
		return true;
		
	}
}
