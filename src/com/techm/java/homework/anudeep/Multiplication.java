package com.techm.java.homework.anudeep;

public class Multiplication 
{
	public static void main(String[] args) 
	{
		System.out.println("This program is for multiplication");
		int a[][]={{1,2,3},{4,5,6},{7,8,9}};
		int b[][]={{9,8,7},{6,5,4},{3,2,1}};
		int c[][]=new int[3][3];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				for(int k=0;k<c.length;k++)
				{
					c[i][j]=a[i][k]*b[k][j]+c[i][j];
				}
		
			}
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.println(c[i][j]);
				System.out.println(" ");
				
			}
			System.out.println();
		}
		
		
	}

}
