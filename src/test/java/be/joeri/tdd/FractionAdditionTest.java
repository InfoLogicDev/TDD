package be.joeri.tdd;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class FractionAdditionTest {
	@Rule
	public ExpectedException exceptionRule = ExpectedException.none();

	@Test
	public void addFractionTerms_canBeWholeNumber_convertedToFractions() {
		String termOne = "4";
		String termTwo = "3";
		FractionCalculator fractionCalculator = new FractionCalculator(new FractionAddition());
		String result = fractionCalculator.doAddition(termOne, termTwo);
		assertThat(result).isNotNull();
	}

	@Test
	public void addFractionTerms_canBeFractions() {
		String termOne = "3/4";
		String termTwo = "2/3";
		FractionCalculator fractionCalculator = new FractionCalculator(new FractionAddition());
		String result = fractionCalculator.doAddition(termOne, termTwo);
		assertThat(result).isNotNull();
	}

	@Test
	public void addFractionTerms_withBadFormat_throwsException() {
		exceptionRule.expect(FractionInputException.class);
		exceptionRule.expectMessage("Wrong input format for Fraction");
		String termOne = "3/4";
		String termTwo = "2//3";
		FractionCalculator fractionCalculator = new FractionCalculator(new FractionAddition());
		fractionCalculator.doAddition(termOne, termTwo);
	}

	@Test
	public void addFraction_withFloat_throwsException() {
		exceptionRule.expect(FractionInputException.class);
		exceptionRule.expectMessage("Wrong input format for Fraction");
		String termOne = "3.14";
		String termTwo = "2.53";
		FractionCalculator fractionCalculator = new FractionCalculator(new FractionAddition());
		fractionCalculator.doAddition(termOne, termTwo);
	}

	@Test
	public void addFraction_withFirstTermAsFloat_throwsException() {
		exceptionRule.expect(FractionInputException.class);
		exceptionRule.expectMessage("Wrong input format for Fraction");
		String termOne = "3.14";
		String termTwo = "2";
		FractionCalculator fractionCalculator = new FractionCalculator(new FractionAddition());
		fractionCalculator.doAddition(termOne, termTwo);
	}
	@Test
	public void addFraction_withSecondTermAsFloat_throwsException() {
		exceptionRule.expect(FractionInputException.class);
		exceptionRule.expectMessage("Wrong input format for Fraction");
		String termOne = "3";
		String termTwo = "2.124";
		FractionCalculator fractionCalculator = new FractionCalculator(new FractionAddition());
		fractionCalculator.doAddition(termOne, termTwo);
	}
}
