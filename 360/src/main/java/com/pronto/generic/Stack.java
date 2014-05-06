package com.pronto.generic;

public class Stack {

	private static final int SIZE = 5;

	private int[] array = new int[SIZE];

	private int top = -1;

	public void push(int value) {
		if (top == SIZE - 1) {
			throw new IllegalArgumentException("Stack already full");
		}
		array[++top] = value;
	}

	public int pop() {
		if (top == -1) {
			throw new IllegalArgumentException("Stack is empty");
		}
		int value = array[--top];
		return value;
	}

	public void print() {
		System.out.println("\n\nElements are: ");
		for(int i = top; i >= 0 ; i --) {
			System.out.print(array[i] + ", ");
		}
	}

}
