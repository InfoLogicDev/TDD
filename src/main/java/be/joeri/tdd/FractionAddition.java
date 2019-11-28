package be.joeri.tdd;

import be.joeri.tdd.model.Fraction;

public class FractionAddition {
	public Fraction addition(Integer termOne, Integer termTwo){
		Fraction termOneFraction = new Fraction(termOne);
		return termOneFraction;
	}

	public Fraction addition(Fraction termOne, Fraction termTwo){
		return termOne;
	}
}
