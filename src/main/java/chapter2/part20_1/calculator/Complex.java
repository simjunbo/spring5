package chapter2.part20_1.calculator;

public class Complex {
	private int real;
	private int imaginary;

	public Complex(int real, int imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}

	public int getReal() {
		return real;
	}

	public void setReal(int real) {
		this.real = real;
	}

	public int getImaginary() {
		return imaginary;
	}

	public void setImaginary(int imaginary) {
		this.imaginary = imaginary;
	}

	public String toString() {
		return "(" + real + " + " + imaginary + "i)";
	}
}
