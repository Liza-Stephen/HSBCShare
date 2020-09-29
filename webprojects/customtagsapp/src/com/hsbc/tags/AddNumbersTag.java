package com.hsbc.tags;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class AddNumbersTag extends SimpleTagSupport {

	private int num1;
	private int num2;

	public AddNumbersTag() {
		super();
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public void doTag() throws JspException, IOException {
		JspWriter out = getJspContext().getOut();
		out.println("Number1: " + num1 + "<br>");
		out.println("Number2: " + num2 + "<br>");
		int sum = num1 + num2;
		out.println("Sum: " + sum);
	}

}
