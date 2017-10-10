package com.techm.java.homework.keerthi;

public class ResultMethodTest {

	public static void main(String[] args) {
		System.out.println(FinalResult(94,95,97));
		System.out.println(FinalResult1(98,94,34));	

	}
	
	static String FinalResult(int s1,int s2,int s3){
		
		String result = null ;
		
		float avg = (s1+s2+s3)/3;
		if(avg >= 95   && (s1>=95 && s2 >=95 && s3 >= 95)  )
			result="Scored with Distinction";
		else if(avg>=95)
			result="Distinction ";
		
		else if(avg > 75)
			result = "First Class";
		
		else if(avg > 65)
			result = "Second class";
		
		else if( avg > 55 && avg < 65 )
			result = "3rd class";
		
		else if(avg<55)
			result = "Keep Working";

		return result;

	} 
	
	static String FinalResult1(int s1,int s2,int s3){
		String result1 = "Work hard" ;
		
		 if(s1>=95 && s2 >= 95 && s3 >= 95)
			 result1 ="Scored with Distinction ";
		 else if(s1 <= 35 && s2 <= 35 && s3<= 35)
			 result1 = "Failed";
		 else if(s1 <= 35 && s2 <= 35 && s3<= 35)
			 result1 = "Failed In all subjects";
		 else if(s1 <= 35 && s2 >= 35 && s3>= 35)
			 result1 = "Failed In subjects Maths";
		 else if(s1 >= 35 && s2 <= 35 && s3>= 35)
			 result1 = "Failed In subjects Physics";
		 else if(s1 >= 35 && s2 >= 35 && s3<= 35)
			 result1 = "Failed In subjects Chemistry";
		return result1;
	
	}
	
	
}
