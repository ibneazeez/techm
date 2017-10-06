package com.techm.java.classwork;

public class CalculatorException {
	
	private static  int add(int a, int b){
		return a+b;
	}
	
	private static  int sub(int a, int b){
		return a-b;
	}
	
	
	private static  int divwithHandle(int a, int b){
		
		int c = 0;
		try{
		c = a/b;
		}catch(Exception e){
			System.out.println("Handing Here");
			c=-1;
		}
		
		return c;
	}
	
	
	private static int divDeligateException(int a, int b) throws Exception{
		
		int c=0;
		try{
			c = a/b;
		} catch(Exception e){
			System.out.println("Deliate EXCEPTION E");
			throw new Exception();
		}
		return c;
	}
	
	
	public static void main(String[] args) {
		
		int a=10;
		int b = 0;
		System.out.println(add(a, b));
		System.out.println(divwithHandle(a, b));
		
		try {
			System.out.println(divDeligateException(a, b));
		} catch (Exception e) {
			e.printStackTrace();
		System.out.println("I am handling Deligation");
		}
		
		
		
		
		
	}

}

