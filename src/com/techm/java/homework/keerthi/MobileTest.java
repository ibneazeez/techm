package com.techm.java.homework.keerthi;



public class MobileTest {

	public static void main(String[] args) {
		
		Mobile mb = new Mobile();
		
		boolean moto= true;
		
			
		if(moto){
			mb= new moto();
		} else {
			mb = new NokiaBasic();
		}

		mb.answering();
		
				
	}

}
