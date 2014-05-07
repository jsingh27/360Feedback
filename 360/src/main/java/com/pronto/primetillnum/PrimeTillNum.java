package com.pronto.primetillnum;

import java.util.Set;
import java.util.TreeSet;

public class PrimeTillNum {

	public Set<Integer> generatePrimeNumbers(int num) {
		
		Set<Integer> set = new TreeSet<Integer>();

		for (int i = num; i >= 2; i--) {
			Boolean isPrime = checkPrime(i);
			if (isPrime == true) {
				set.add(i);
			}
		}

		return set;
	}

	public Boolean checkPrime(int num) {
		
		if(num % 2 == 0) {
			return false;
		}
		
		int sqrt = (int) Math.sqrt(num);
		
		for (int i = 3; i <= sqrt; i+= 2) {
			int temp = num % i;
			if (temp == 0) {
				return false;
			}
		}
		
		return true;
	}
}
