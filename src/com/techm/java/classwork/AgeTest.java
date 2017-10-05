package com.techm.java.classwork;

public class AgeTest {
	
	public static void enterAge(int age) throws AgeOutOfBoundException {
		if(age>=1 && age <= 150){
			throw new AgeOutOfBoundException();
		}
	}
	
	public static void main(String[] args) {
		
		
		int age=-10;
		
		try {
			
			int i = 10/0;
			enterAge(age);
			
		} catch (AgeOutOfBoundException e) {


			System.out.println("Please enter valid age from (0..150)");
		}catch (ArithmeticException e) {


			System.out.println("Please enter valid age from (0..150)");
		}
		
		
	}
	
	
	
	

}
