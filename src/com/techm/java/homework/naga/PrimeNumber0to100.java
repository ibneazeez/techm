package com.techm.java.homework.naga;

public class PrimeNumber0to100 {

	public static void main(String[] args) {
		int r=1;		
		boolean b=false;
		
		for (int i = 1;i<100;i++){
			for (int j=2;j<i;j++){
				r=i%j;
				if (r==0)
				b = true;
				break;
				}
			if (b != true){
				System.out.println(i +" Is a Prime Number");
			}else {
				System.out.println(i);				
			}
			}
		b=false;
	
}}
