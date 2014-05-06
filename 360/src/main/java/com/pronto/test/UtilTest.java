package com.pronto.test;

import java.util.ArrayList;
import java.util.Stack;

import com.pronto.cabs.User;

public class UtilTest {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		
		stack.push("Hello");
		
		
		String a = new String("hello");
		String b = new String("hello");
		
		System.out.println("String: " + a.equals(b));
		
		User u = new User();
		u.setName("asd");
		u.setId(1L);
		
		User u1 = new User();
		u1.setId(1L);
		
		
		System.out.println("User: " + u1.equals(u));
		
		
		
		ArrayList<String> strings = new ArrayList<String>(50);
		strings.add("Karan");
		strings.add("Akshay");
		strings.add("Sandeep");
		strings.add("Jassi");
		strings.add("Neha");
		System.out.println(strings.toString());
		
	} 
}
