package com.pronto.generic;

import java.lang.reflect.Array;

public class GenericStack <T> {

	private static final int SIZE = 5;

	private T[] array;
	
	@SuppressWarnings("unchecked")
	public GenericStack(Class<T> claz) {
		array = (T[]) Array.newInstance(claz, SIZE);
	}

	private int top = -1;

	public void push(T value) {
		if (top == SIZE - 1) {
			throw new IllegalArgumentException("Stack already full");
		}
		array[++top] = value;
	}

	public T pop() {
		if (top == -1) {
			throw new IllegalArgumentException("Stack is empty");
		}
		T value = array[--top];
		return value;
	}

	public void print() {
		System.out.println("\n\nElements are: ");
		for(int i = top; i >= 0 ; i --) {
			System.out.print(array[i] + ", ");
		}
	}

}
