package com.techm.java.homework.anudeep;

public class Primenumberwithm 
{
	public static void main(String[] args) 
	{
	for(int start=0;start<=100;start++)
	{
		if(start==2)
			System.out.println("prime number"+2);
		if(start%2==0)
			continue;
		for(int end=2;end<start;end++)
		{
			if(start%end==0)
				break;
			else if (end==(start-1)){
				System.out.println("primenumber values"+start);
			break;
		}
	}
	}	
		
	}

}
