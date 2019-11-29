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
		assertEquals(new Fraction(0,1), new Fraction(0).plus(new Fraction(0)));
	}

	@Test
	public void nonZeroPlusZero() throws Exception {
		assertEquals(new Fraction(3, 1), new Fraction(3).plus(new Fraction(0)));
	}

	@Test
	public void zeroPlusNonZero() throws Exception {
		assertEquals(new Fraction(5,1), new Fraction(0).plus(new Fraction(5)));
	}

	@Test
	public void nonNegativenonZeroOperands() throws Exception {
		assertEquals(new Fraction(7, 1), new Fraction(2).plus(new Fraction(5)));
	}

	@Test
	public void negativeTermsWithNegativeResult() throws Exception {
		assertEquals(new Fraction(-2,1), new Fraction(-3).plus(new Fraction(1)));
	}

	@Test
	public void nonTrivialButCommonDenominator() throws Exception {
		assertEquals(
				new Fraction(3, 5),
				new Fraction(1,5).plus(new Fraction(2,5)));
	}

	@Test
	public void differentDenominatorWithoutReduce() throws Exception {
		assertEquals(new Fraction(5, 6), new Fraction(1,2).plus(new Fraction(1,3)));
	}
}
