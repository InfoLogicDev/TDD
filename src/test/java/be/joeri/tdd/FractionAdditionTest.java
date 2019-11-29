package be.joeri.tdd;

import static org.junit.Assert.assertEquals;

import be.joeri.tdd.model.Fraction;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class FractionAdditionTest {
	@Rule
	public ExpectedException exceptionRule = ExpectedException.none();

	@Test
	public void zeroPlusZero() throws Exception {
		assertEquals(0, new Fraction(0).plus(new Fraction(0)).intValue());
	}

	@Test
	public void nonZeroPlusZero() throws Exception {
		assertEquals(3, new Fraction(3).plus(new Fraction(0)).intValue());
	}

	@Test
	public void zeroPlusNonZero() throws Exception {
		assertEquals(5, new Fraction(0).plus(new Fraction(5)).intValue());
	}

	@Test
	public void nonNegativenonZeroOperands() throws Exception {
		assertEquals(7, new Fraction(2).plus(new Fraction(5)).intValue());
	}

	@Test
	public void negativeTermsWithNegativeResult() throws Exception {
		assertEquals(-2, new Fraction(-3).plus(new Fraction(1)).intValue());
	}

	@Test
	public void nonTrivialDenominator() throws Exception {
		Fraction sum = new Fraction(1,5).plus(new Fraction(2,5));
		assertEquals(3, sum.getNumerator());
		assertEquals(5, sum.getDenominator());
	}
}
