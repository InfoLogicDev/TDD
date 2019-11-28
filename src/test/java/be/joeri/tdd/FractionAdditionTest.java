package be.joeri.tdd;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.fail;

import be.joeri.tdd.model.Fraction;
import org.junit.Test;

public class FractionAdditionTest {
	@Test
	public void addFractionTerms_canBeWholeNumber_convertedToFractions(){
		Integer termOne = 4;
		FractionAddition fractionAddition = new FractionAddition();
		Fraction result =  fractionAddition.addition(termOne, termOne);
		assertThat(result).isNotNull();
		assertThat(result.getNumerator()).isEqualTo(termOne*termOne);
		assertThat(result.getDenominator()).isEqualTo(termOne);
	}

	@Test
	public void addFractionTerms_canBeFractions(){
		Fraction termOne = new Fraction(3, 4);
		Fraction termTwo = new Fraction(2, 3);
		FractionAddition fractionAddition = new FractionAddition();
		Fraction result = fractionAddition.addition(termOne, termTwo);
		assertThat(result).isNotNull();
	}
}
