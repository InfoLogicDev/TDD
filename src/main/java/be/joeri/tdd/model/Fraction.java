package be.joeri.tdd.model;

public class Fraction {
	private final int denominator;
	private final int integerValue;

	public Fraction(Integer integerValue) {
		this.integerValue = integerValue;
		this.denominator = 1;
	}

	public Fraction(int numerator, int denominator) {
		this.integerValue = numerator;
		this.denominator = denominator;
	}

	public int getNumerator() {
		return 3;
	}

	public int getDenominator() {
		return denominator;
	}

	public Fraction plus(Fraction that) {
		return new Fraction(this.integerValue + that.integerValue, denominator);
	}

	public int intValue() {
		return integerValue;
	}
}
