package be.joeri.tdd;

import be.joeri.tdd.model.Fraction;

public class FractionCalculator {
	private static final String FRACTION_SIGN= "/";
	private FractionAddition fractionAddition;

	public FractionCalculator(FractionAddition fractionAddition) {
		this.fractionAddition = fractionAddition;
	}

	public String doAddition(String termOne, String termTwo) {
		Fraction fractionTermOne = inputTermToFraction(termOne);
		Fraction fractionTermTwo = inputTermToFraction(termTwo);
		Fraction result = fractionAddition.addition(fractionTermOne, fractionTermTwo);
		return result.toString();
	}

	private Fraction inputTermToFraction(String inputTerm){
		if (inputTerm.contains(FRACTION_SIGN)){
			String[] fractionParts = inputTerm.split(FRACTION_SIGN);
			if (fractionParts.length == 2){
				try {
					return new Fraction(Integer.parseInt(fractionParts[0]), Integer.parseInt(fractionParts[1]));
				} catch ( NumberFormatException nfe ) {
					throw new FractionInputException(String.format("Wrong input format for Fraction numerator, denomitator input=%s, message=%s ", inputTerm, nfe.getMessage()));
				}
			} else {
				throw new FractionInputException(String.format("Wrong input format for Fraction term=%s .", inputTerm));
			}
		}
		try {
			return new Fraction(Integer.parseInt(inputTerm));
		} catch ( NumberFormatException nfe ) {
			throw new FractionInputException(String.format("Wrong input format for Fraction wholeNumber input=%s, message=%s ", inputTerm, nfe.getMessage()));
		}
	}
}
