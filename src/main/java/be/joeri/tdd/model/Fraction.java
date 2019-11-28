package be.joeri.tdd.model;

import jdk.nashorn.internal.objects.annotations.Getter;

public class Fraction {
	private Integer numerator;
	private Integer denominator;

	public Fraction(Integer numerator, Integer denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}

	public Fraction(Integer wholeNumber) {
		this.numerator = wholeNumber * wholeNumber;
		this.denominator = wholeNumber;
	}

	public Integer getNumerator() {
		return numerator;
	}

	public void setNumerator(Integer numerator) {
		this.numerator = numerator;
	}

	public Integer getDenominator() {
		return denominator;
	}

	public void setDenominator(Integer denominator) {
		this.denominator = denominator;
	}
}
