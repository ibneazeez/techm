package com.techm.java.homework.anudeep;

public class Salary 
{
	public static void main(String[] args) 
	{
		System.out.println("Welcome to Salary details");
		basicmethod(9494.50f);
		
	}
	private static void basicmethod(float sal)
	{
		float hra=(30f/100)*sal;
		float DA=(10f/100)*sal;
		float mbonus=(5f/100)*sal;
		float Total=hra+DA+mbonus;
		System.out.println("DA is:"+DA);
		System.out.println("salary is"+sal);
		System.out.println("HRA is :"+hra);
		System.out.println("total salary is :"+Total);
		
		
	}

}
