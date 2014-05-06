package com.pronto.test;

import com.pronto.generic.GenericStack;

public class GenericTest {

	public static void main(String[] args) {
//		Stack stack = new Stack();
//		stack.print();
//		stack.push(23);
//		stack.print();
//		stack.push(23);
//		stack.print();
//		stack.push(3);
//		stack.print();
//		stack.push(323);
//		stack.print();
//		stack.push(8);
//		stack.print();
//		System.out.println("Elemtn popped: "+ stack.pop());
//		stack.push(822);

		GenericStack<String> stringStack = new GenericStack<String>(String.class);
		stringStack.push("HELLO");
		stringStack.print();
		
		GenericStack<Integer> intStack = new GenericStack<Integer>(Integer.class);
		intStack.push(12);
		intStack.print();
		
		
		
 		
	}

}
