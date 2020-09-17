package com.hsbc.inter;

public class Square implements Shape {

	private double length;

	public Square(double length) {
		super();
		this.length = length;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	@Override
	public double getArea() {

		return length * length;
	}

	@Override
	public double getPeri() {

		return 4 * length;
	}

}
