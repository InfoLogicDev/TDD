package be.joeri.tdd;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import be.joeri.tdd.model.Fraction;
import org.junit.Test;

public class FractionEqualsTest {
	@Test
	public void sameNumeratorAndDenominator() throws Exception {
		assertEquals(new Fraction(3,5), new Fraction(3,5));
	}

	@Test
	public void differentNumerators() throws Exception {
		assertNotEquals(new Fraction(3,5), new Fraction(4,5));
	}

	@Test
	public void differentDenominators() throws Exception {
		assertNotEquals(new Fraction(3,5), new Fraction(3,7));
	}

	@Test
	public void wholeNumberEqualsSameFraction() throws Exception {
		assertEquals(new Fraction(5,1), new Fraction(5));
	}

	@Test
	public void nameWholeNumberNotEqualsToDifferentWholeNumber() throws Exception {
		assertNotEquals(new Fraction(5), new Fraction(7));
	}
}
