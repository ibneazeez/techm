package com.techm.java.homework.anudeep;

public class Calculator 
{
	public static void main(String[] args) 
	{
		int a=10;
		int b=5;
		//float b=20f;
		System.out.println("addition"+ add(a,b));
		System.out.println("subtraction is "+subtract(a,b));
		System.out.println("multiplication is "+mul(a,b));
		
	}
	private static int add(int a,int b)
	{
		return a+b;
		
	}
	private static int subtract(int a,int b)
	{
		return a-b;
	}
	
	private static int mul(int a,int b)
	{
		return a*b;
	}
}
