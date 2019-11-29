package be.joeri.tdd;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GreatestCommonDivisorTest {
	@Test
	public void reflexive() throws Exception {
		assertEquals(1, gcd(1,1));
		assertEquals(2, gcd(2,2));
		assertEquals(-1, gcd(-1,-1));
	}

	@Test
	public void relativePrime() throws Exception {
		assertEquals(1, gcd(2,3));
		assertEquals(1, gcd(4,7));
		assertEquals(-1, gcd(-2,-3));
	}

	@Test
	public void oneIsMultipleOfTheOther() throws Exception {
		assertEquals(3, gcd(3,9));
		assertEquals(5, gcd(5,30));
	}

	@Test
	public void commonFactor() throws Exception {
		assertEquals(2, gcd(6,8));
		assertEquals(7, gcd(49,315));
	}

	@Test
	public void negatives() throws Exception {
		assertEquals(-4, gcd(-24,-28));
		assertEquals(4, gcd(-24,28));
		assertEquals(-4, gcd(24,-28));
	}

	private int gcd(int a, int b) {
		while(b!=0){
			int t=b;
			b = a% t;
			a =t;
		}
		return a;
	}

}
