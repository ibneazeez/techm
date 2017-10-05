package com.techm.java.homework.naga;

public class BreakAndContinueInNestedForLoop {
	
	//I would like to print only Even % Odd Numbers from 1 to 50.
	public static void main(String[] args) {
		int i=1;
		System.out.println("Printing Even & Odd Numbers");
	for(;i<=100;i++){		
		if(i%2!=0){
			if(i>50){
				break;
			}
			continue;
			//System.out.println(i+"--Odd");--Unreachable code error
		}
		System.out.println(i+"--Even");				
	}for(int j =1;j<=100;j++){
		if(j%2==0){
			if(j>49){
				break;
			}continue;
		}
		System.out.println(j+"--Odd");
	}
	}
}
