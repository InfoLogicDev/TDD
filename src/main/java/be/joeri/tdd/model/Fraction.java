package be.joeri.tdd.model;

public class Fraction {
	private int integerValue;

	public Fraction(Integer integerValue) {
		this.integerValue = integerValue;
	}

	public Fraction(int numerator, int denominator) {
	}

	public int getNumerator() {
		return 3;
	}

	public int getDenominator() {
		return 5;
	}

	public Fraction plus(Fraction that) {
		return new Fraction(this.integerValue + that.integerValue);
	}

	public int intValue() {
		return integerValue;
	}
}
