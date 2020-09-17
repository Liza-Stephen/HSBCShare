package com.hsbc.inter;

public class Rectangle implements Shape {

	private double length;
	private double breadth;

	public Rectangle(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getBreadth() {
		return breadth;
	}

	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}

	@Override
	public double getArea() {

		return length * breadth;
	}

	@Override
	public double getPeri() {

		return 2 * (length + breadth);
	};

}
