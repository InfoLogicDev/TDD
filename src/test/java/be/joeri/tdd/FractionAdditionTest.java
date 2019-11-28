package be.joeri.tdd;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.fail;

import be.joeri.tdd.model.Fraction;
import org.junit.Test;

public class FractionAdditionTest {
	@Test
	public void addFractionInput_canBeWholeNumber_convertedToFraction(){
		Integer termOne = 4;
		FractionAddition fractionAddition = new FractionAddition();
		Fraction result =  fractionAddition.addition(termOne, termOne);
		assertThat(result).isNotNull();
		assertThat(result.getNumerator()).isEqualTo(termOne*termOne);
		assertThat(result.getDenominator()).isEqualTo(termOne);
	}
	
}
