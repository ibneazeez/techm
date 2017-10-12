package com.techm.java.classwork.oct12;

public class ConstantTest {
	
	
	public static void main(String[] args) {
		
		Constants constants = new Constants();
		constants.setSampleValue(1);
		Constants constants1 = new Constants();
		constants1.setSampleValue(2);
		
		System.out.println(constants.getSampleValue());
		System.out.println(constants1.getSampleValue());
		
		System.out.println(Constants.EMP_COMPANY_NAME);
		System.out.println(Constants.EMP_COMPANY_NAME);
		sum(10, 10);
	}
	
	public static int sum(int a, int b){
		return a + b;
	}
	
	
	
	
	


}
