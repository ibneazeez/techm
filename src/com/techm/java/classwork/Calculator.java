package com.techm.java.classwork;

public class Calculator {
	
	
	public static void main(String[] args) {
		
		int a=10;
		int b = 34;
		
		
		System.out.println( add(a,b));
		System.out.println(add(a,b,10));
		
		//checkResult(int m1, int m2, int m3)
	}
	
	
	// intigervalue two parameters 
	private static int add(int a, int b){
		int c = a+b;
		
		return c;
	}
	
	private static int add(int a, int b, int c){
		return a + b + c;
	}
	
	private static float add(int a, int b, float c){
		
		return (a+b+c);
	}
	
	
	}
	
	
	
	// Compile time polymorphism
	
	
	
