package com.techm.java.homework.anudeep;

public class SalaryMethod
{
	public static void main(String[] args) 
	{
		float sal=1500f;
		System.out.println("salary of basic is :"+basic(sal));
		DA(sal);
		hra(sal);
		
	}
	private static float basic(float sal)
	{
		return sal=(float) (sal*0.3);
		
	}
   private static void DA(float sal)
	{
		float DA=(float) (sal*0.5);
		System.out.println("the DA is "+DA);
	}
   static void hra(float sal)
   {
	   float hra=(float)(sal*0.6);
	   System.out.println("hra"+hra);
   }
}
