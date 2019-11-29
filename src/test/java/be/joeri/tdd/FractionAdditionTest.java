package be.joeri.tdd;

import static org.junit.Assert.assertEquals;

import be.joeri.tdd.model.Fraction;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class FractionAdditionTest {
	@Rule
	public ExpectedException exceptionRule = ExpectedException.none();

	@Test
	public void zeroPlusZero() throws Exception {
		Fraction sum = new Fraction(0).plus(new Fraction(0));
		assertEquals(0, sum.intValue());
	}

	@Test
	public void nonZeroPlusZero() throws Exception {
		final Fraction sum = new Fraction(3).plus(new Fraction(0));
		assertEquals(3, sum.intValue());
	}

	@Test
	public void zeroPlusNonZero() throws Exception {
		final Fraction sum = new Fraction(0).plus(new Fraction(5));
		assertEquals(5, sum.intValue());
	}

	@Test
	public void nonNegativenonZeroOperands() throws Exception {
		final Fraction sum = new Fraction(2).plus(new Fraction(5));
		assertEquals(7, sum.intValue());
	}
}
