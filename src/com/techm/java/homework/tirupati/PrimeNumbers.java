package com.techm.java.homework.tirupati;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Prime Numbers
		
		System.out.println("Prime numbers between 0 to 100");
		
		for (int a =2; a<=100;a++){
			for (int b = 2; b<=a; b++){
				if(a==b)
					System.out.print(a + " ");
				if (a%b==0){
					break;
				}
			}
			
		}
		
		
		
	}

}
