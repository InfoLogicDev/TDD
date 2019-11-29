package be.joeri.tdd;

import static org.junit.Assert.assertEquals;

import be.joeri.tdd.model.Fraction;
import org.junit.Test;

public class FractionEqualsTest {
	@Test
	public void sameNumeratorAndDenominator() throws Exception {
		assertEquals(new Fraction(3,5), new Fraction(3,5));

	}
}
