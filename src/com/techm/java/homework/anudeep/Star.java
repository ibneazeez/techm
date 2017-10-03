package com.techm.java.homework.anudeep;

public class Star
{
	public static void main(String[] args) {
		int stop=5;
		int start=1;
		for(int i=1;i<=start;i++){
			
			for(int space=start;space<=(stop*2)-i;space++){
				System.out.print(" ");
			}
			start=start+1;
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			for(int j=i;j>1;j--){
				System.out.print("***");
			}
			System.out.println();
			if(start==stop){
				break;
			}
			
		}

	}

}

