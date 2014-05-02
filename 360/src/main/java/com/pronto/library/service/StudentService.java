package com.pronto.library.service;

import com.pronto.library.domain.Student;

public class StudentService {

	public Student findStudentById(Long studentId) {
		Student student = new Student();
		student.setId(studentId);
		return student;
	}
}
