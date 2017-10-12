package com.techm.java.classwork.oct12;

public class SaticBlock {
	static int sum ;
	
	
	static {
	
		int a=10;
		int b = 20;
		sum = a + b;
	
	}
	
	public static void main(String[] args) {
		
	System.out.println(sum);
	}

}
