package com.pronto.sort;

public class SelectionSort implements Sort {

	public int[] sort(int[] array) {
		int elementssort[] = array.clone();
		int i, j, first, temp;

		for (i = elementssort.length - 1; i > 0; i--) {
			first = 0;
			for (j = 1; j <= i; j++) {
				if (elementssort[j] < elementssort[first])
					first = j;
			}
			temp = elementssort[first];
			elementssort[first] = elementssort[i];
			elementssort[i] = temp;
		}
		System.out.println("This is slelection sort");
		return elementssort;
	}
}
