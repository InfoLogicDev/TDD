package be.joeri.tdd.model;

public class Fraction {
	private final int denominator;
	private final int numerator;

	public Fraction(Integer integerValue) {
		this.numerator = integerValue;
		this.denominator = 1;
	}

	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}

	public int getNumerator() {
		return numerator;
	}

	public int getDenominator() {
		return denominator;
	}

	public Fraction plus(Fraction that) {
		return new Fraction(this.numerator + that.numerator, denominator);
	}

	public int intValue() {
		return numerator;
	}
}
