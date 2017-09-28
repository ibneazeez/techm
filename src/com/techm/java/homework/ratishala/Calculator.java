package com.techm.java.homework.ratishala;

public class Calculator {
	public static void main(String[] args) {
		// int a=20, b=10;
		// float a=20.5f, b=10.6f;
		int a = 10;
		float b = 20.7f;
		System.out.println("Addition of" + " " + a + " " + "&" + " " + b + " " + "is:" + " " + addition(a, b));
		System.out.println("Subtraction of" + " " + a + " " + "&" + " " + b + " " + "is:" + " " + subtraction(a, b));
		System.out.println("Division of" + " " + a + " " + "&" + " " + b + " " + "is:" + " " + division(a, b));
		System.out.println(
				"Multiplication of" + " " + a + " " + "&" + " " + b + " " + "is:" + " " + multiplication(a, b));
	}

	private static int addition(int a, int b) {
		return a + b;
	}

	private static float addition(float a, float b) {
		return a + b;
	}

	private static float addition(int a, float b) {
		return a + b;
	}

	private static int subtraction(int a, int b) {
		if (a > b)
			return a - b;
		else
			return b - a;
	}

	private static float subtraction(float a, float b) {
		if (a > b)
			return a - b;
		else
			return b - a;
	}

	private static float subtraction(int a, float b) {
		if (a > b)
			return a - b;
		else
			return b - a;
	}

	private static int division(int a, int b) {
		if (a > b)
			return a / b;
		else
			return b / a;
	}

	private static float division(float a, float b) {
		if (a > b)
			return a / b;
		else
			return b / a;
	}

	private static float division(int a, float b) {
		if (a > b)
			return a / b;
		else
			return b / a;
	}

	private static int multiplication(int a, int b) {
		return a * b;
	}

	private static float multiplication(float a, float b) {
		return a * b;
	}

	private static float multiplication(int a, float b) {
		return a * b;
	}
}
