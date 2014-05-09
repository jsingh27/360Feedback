package com.pronto;

import java.util.ArrayList;
import java.util.List;

import maths.EvenAndAddEven;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class EvenCheckTest {

	EvenAndAddEven even = EvenAndAddEven.getInstance();

	@Test
	public void shouldBeEven() {
		Boolean actual = even.isEven(8);
		Assert.assertEquals(Boolean.TRUE, actual);
	}

	@Test
	public void shouldNotBeEven() {
		Boolean actual = even.isEven(7);
		Assert.assertEquals(Boolean.FALSE, actual);
	}

	@Test
	public void shouldReturnSumOfEven() {

		List<Integer> list = new ArrayList<Integer>();
		list.add(4);
		list.add(3);
		list.add(3);
		list.add(3);
		list.add(3);
		list.add(3);
		list.add(-2);
		int actual = even.returnSumOfEven(list);
		Assert.assertEquals(2, actual);
	}

}
