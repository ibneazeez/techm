package com.techm.java.classwork.oct10;

public class Strings {
	
	
	public static void main(String[] args) {
		
		String str = "ANEES";
		String str1 = "ANEES";
		String str2 = new String ("ANEES");
		
		if(str==str1){
			System.out.println("Both are Equal");
		} else {
			System.out.println("Not Equal");
		}
		
		if(str.equals(str1)){
			System.out.println("Both are euql with Equals Method");
		} else {
			System.out.println("Not euqals (equal method)");
		}
		
		
	}

}
