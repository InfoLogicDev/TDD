package be.joeri.tdd;

import static org.junit.Assert.assertEquals;

import be.joeri.tdd.model.Fraction;
import org.junit.Ignore;
import org.junit.Test;

public class ReduceFractionTest {
	@Test
	public void alreadyInLowestTerms() throws Exception {
		assertEquals(new Fraction(3, 4), new Fraction(3, 4));
	}

	@Test
	@Ignore("Waiting to implement GCD")
	public void reduce() throws Exception {
		assertEquals(new Fraction(3, 4), new Fraction(6, 8));
	}
}
