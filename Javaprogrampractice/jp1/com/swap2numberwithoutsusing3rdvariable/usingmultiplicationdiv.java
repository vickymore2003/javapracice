package com.swap2numberwithoutsusing3rdvariable;

public class usingmultiplicationdiv {

	public static void main(String[] args) {
		int a = 5, b = 3;

		a = a * b;
		b = a / b;
		a = a / b;
		System.out.println("a is := " + a + "and b is =" + b);

	}
}