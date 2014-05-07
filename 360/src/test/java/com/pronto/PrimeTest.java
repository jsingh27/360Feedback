package com.pronto;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import com.pronto.primetillnum.PrimeTillNum;

@RunWith(JUnit4.class)
public class PrimeTest {

	PrimeTillNum primeTillNum = new PrimeTillNum();

	@Test
	public void shouldBePrime() {
		Boolean actual = primeTillNum.checkPrime(7);
		Assert.assertEquals(Boolean.TRUE, actual);
	}

	@Test
	public void shouldNotBePrime() {
		Boolean actual = primeTillNum.checkPrime(20);
		Assert.assertEquals(Boolean.FALSE, actual);

	}

}
