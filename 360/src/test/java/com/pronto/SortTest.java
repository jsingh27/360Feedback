package com.pronto;

import junit.framework.Assert;
import junit.framework.TestCase;

import com.pronto.sort.SelectionSort;
import com.pronto.sort.Sort;

public class SortTest extends TestCase {
	
	public void shouldSortInDescendingOrder() {
		Sort sort = new SelectionSort();
		
		int[] input = {53,2,21};
		int[] sortedArray = sort.sort(input);
		
		Assert.assertEquals(53, sortedArray[0]);
		Assert.assertEquals(21, sortedArray[1]);
		Assert.assertEquals(2, sortedArray[2]);

		Assert.assertEquals(53, input[0]);
		Assert.assertEquals(2, input[1]);
		Assert.assertEquals(21, input[2]);
		
	}

}
