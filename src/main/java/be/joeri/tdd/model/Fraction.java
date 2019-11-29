package be.joeri.tdd.model;

public class Fraction {
	private final Integer integerValue;
	private Integer numerator;
	private Integer denominator;

	public Fraction(Integer wholeNumber) {
		this.integerValue = wholeNumber;
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

	public Fraction plus(Fraction that) {
		if (that.integerValue != 0) {
			return new Fraction(this.integerValue + that.integerValue);
		} else {
			return this;
		}
	}

	public int intValue() {
		return integerValue;
	}
}
