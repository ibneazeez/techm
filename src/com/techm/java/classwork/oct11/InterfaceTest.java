package com.techm.java.classwork.oct11;

public class InterfaceTest {
	
	
	public static void main(String[] args) {
		
		
		CalculatorInterface c1 = new CalculatorImplV1();
		int sum = c1.sum(10, 20);
		//c1.getValue();
		System.out.println(sum);
		
	}

}
