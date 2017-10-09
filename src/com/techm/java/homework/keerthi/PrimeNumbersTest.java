package com.techm.java.homework.keerthi;

public class PrimeNumbersTest {

	public static void main(String[] args) {
		
		
		PrimeNumber();
		 //NonPrimeNumber();
	}
	
	
/*	private static void NonPrimeNumber(){
	
		for (int i=0;i<=100;i++){
		if(i%2==0)
		continue;
		for(int j=2;j<i;j++){
			if(i%j == 0)
				continue;
			System.out.print(i);
		}
		
	}
}*/
	
	
	private static void PrimeNumber(){
		
		for (int i=0;i<=100;i++){
			if(i%2==0)
			continue;
			for(int j=2;j<i;j++){
				if(i%j == 0)
					break;
				else if(j == (i-1))
				System.out.print(" " + i);
				
			}
		}
	}
}
