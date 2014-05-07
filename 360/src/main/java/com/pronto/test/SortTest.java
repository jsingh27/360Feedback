package com.pronto.test;

import com.pronto.sort.BubbleSort;
import com.pronto.sort.Sort;

public class SortTest {

	public static void main(String[] args) {

		int[] array = { 1, 56, 2, 31, 5, 3 };
		
		Sort sort = new BubbleSort();
		
		
		int[] sortedArray = sort.sort(array);

		System.out.println("Sorted array: ");
		for (int i : sortedArray) {
			System.out.print(i + ", ");
		}
		
	}
}
