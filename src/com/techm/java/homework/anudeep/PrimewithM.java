package com.techm.java.homework.anudeep;

public class PrimewithM {

	public static void main(String[] args) 
	{
		System.out.println("prime number without method");
		prime();
		
		
	}
	private static void prime()
	{

		for(int i=0;i<100;i++)
		{
			if (i==2)
				System.out.println("Prime number"+i);
			if(i%2==0)
				continue;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
					break;
				else if(j ==(i-1)){
					System.out.println("prime "+i);
					break;
				}
					
					
			}
		}
	}
}
