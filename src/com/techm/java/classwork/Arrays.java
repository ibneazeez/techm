package com.techm.java.classwork;

public class Arrays {
	
	public static void main(String[] args) {
		
		
		int a[]={1,2,3};
		int b[]={1,1,1}; 
		
		
		int c[]= new int[b.length];
		
		//char b[]={'a','b','c','d'};
		
		
		//
		for(int i=0;i<=3;i++){
			
			c[i]=a[i]+b[i];
			//System.out.println(c[i]);
			
		}
		
		for(int i=0;i<3;i++){
		System.out.println(c[i]);
		}
		
		
		
	}

}
