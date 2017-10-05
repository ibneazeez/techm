package com.techm.java.classwork;

public class Exceptions {

	
	public static void main(String[] args) throws Exception {
		
		int i = 0;
		int j = 10;
		
		System.out.println("I am befoer exceptions");
		
		int k =0;
		
		try{
			
		 k = j/i;
		
		}catch(Exception e){
			System.out.println("Handling exception");
			i = 10;
			k= j/i;
		}
		
		
		
		try{
			i = 0;
			 k = j/i;
			
			}catch(Exception e){
				//e.printStackTrace();
				throw new Exception();
			}
			
		System.out.println("I am after exception");
		
		
	}
	
	
}
