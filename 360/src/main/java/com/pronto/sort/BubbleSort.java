package com.pronto.sort;

public class BubbleSort implements Sort {
	
	public int[] sort(int[] array) {
		
		int sortedArray[] = array.clone();
		
		int j;

		// set flag to true to begin first pass
		boolean flag = true;

		// holding variable
		int temp; 

		while (flag) {
			
			// set flag to false awaiting a possible swap
			flag = false; 
			for (j = 0; j < sortedArray.length - 1; j++) {

				// change to > for ascending sort
				if (sortedArray[j] < sortedArray[j + 1]) {
					temp = sortedArray[j]; // swap elements
					sortedArray[j] = sortedArray[j + 1];
					sortedArray[j + 1] = temp;

					// shows a swap occurred
					flag = true; 
				}
			}
		}
		System.out.println("This is bubble sort");
		return sortedArray;
	}
}
