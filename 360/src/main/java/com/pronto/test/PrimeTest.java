package com.pronto.test;

import java.util.Set;

import com.pronto.primetillnum.PrimeTillNum;

public class PrimeTest {

	public static void main(String[] args) {
		PrimeTillNum prime = new PrimeTillNum();
		Set<Integer> list = prime.generatePrimeNumbers(101);
		System.out.println(list);
	}

}
