package com.techm.java.homework.anudeep;

public class Class {
	public static void main(String[] args) 
	{
		for (int school = 0; school < 3; school++) 
		{
			for (int room = 0; room < 4; room++) 
			{
				for (int student = 0; student < 100; student++) 
				{
				System.out.println(school + "School:" + room + "Room:"
							+ "=" + student + "Student");
				}
			}
		}
	}
}
