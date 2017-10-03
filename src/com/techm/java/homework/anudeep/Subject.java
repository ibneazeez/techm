package com.techm.java.homework.anudeep;

public class Subject {
public static void main(String[] args) {
	int m1=60;
	int m2=30;
	int m3=75;
	int total=m1+m2+m3;
	if(m1>=35 && m2>=35 && m3>=35){
		System.out.println("Pass");
		if(total/3>=75){
			System.out.println("Distinction");
		}else if(total/3>=60){
			System.out.println("First Division");
	}else if(total/3>=50){
		System.out.println("Second Division");
	
}
	else{
		System.out.println("Fail");
		if(m1<35){
			System.out.println("Failed in m1");
		}if(m2<35){
			System.out.println("Failed in m2");
		}if(m3<35){
			System.out.println("Failed in m3");
		}
	}
}
}
}