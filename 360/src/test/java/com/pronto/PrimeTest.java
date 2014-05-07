package com.pronto;

import com.pronto.primetillnum.PrimeTillNum;

import junit.framework.Assert;
import junit.framework.TestCase;

public class PrimeTest extends TestCase {
	
	public void shouldBePrime() {
		PrimeTillNum primeTillNum = new PrimeTillNum();
		Boolean actual = primeTillNum.checkPrime(7);
		Assert.assertEquals(Boolean.TRUE, actual);
	}
	
	
	public void shouldNotBePrime() {
		PrimeTillNum primeTillNum = new PrimeTillNum();
		Boolean actual = primeTillNum.checkPrime(20);
		Assert.assertEquals(Boolean.FALSE, actual);
		
	}
	
	
}
