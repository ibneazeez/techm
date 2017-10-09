package com.techm.java.homework.anudeep;

public class Continueandbreak 
{
	public static void main(String[] args) 
	{
		int i=1;
		for(;i<5;i++)
		{
			if(i==2)
				continue;
			System.out.println(i);
		}
		for(int j=0;j<=5;j++)
		{
			if(j==4)
			break;
			System.out.println("value for break is"+j);
		}
		
		
	}

}
