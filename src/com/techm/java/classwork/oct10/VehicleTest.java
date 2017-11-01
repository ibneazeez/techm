package com.techm.java.classwork.oct10;

public class VehicleTest {
	
	public static void main(String[] args) {
		
		
		Vehicle v = new Vehicle();
		/*v = new Car();
		v.breaks();*/
		
		boolean isCycle= true;
		
		// RUNTIME polymorphism
		
		if(isCycle){
			v= new Cycle();
			Cycle c1 =(Cycle)v;
			
		} else {
			v = new Car();
		}

		v.breaks();
		
		
		/*car.breaks();
		cycle.breaks();
		v.breaks();*/
		
		
		//System.out.println(v.toString());
		
	}

}
