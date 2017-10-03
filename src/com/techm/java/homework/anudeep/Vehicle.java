package com.techm.java.homework.anudeep;

class Vehicle1
{
	String VehicleModel="Sports";
	String Vmakername="Skoda/Maruti/Renault";
	void breaks()
	{
		System.out.println("the vehicle breaks");
	}
	void price()
	{
		System.out.println("price is ");
	}


}
class Maruti extends Vehicle1
{
	String type="HighEnd";
	String carname="Dzire";
	void unitplace()
	{
		System.out.println("Chennai");
	}
	void price()
	{
		System.out.println("5L");
	}
	
}
class Skoda extends Vehicle1
{
	String type="Normal";
	String carname="Rapid";
	void unitplace()
	{
		System.out.println("Hyderabad");
	}
}

class Renault extends Vehicle1
{
	String type="SUV";
	String carname="Kwid";
	void unitplace()
	{
		System.out.println("Banglore");
	}	
}

class Vehicle 
{
	public static void main(String[] args) 
	{
		Maruti m=new Maruti();
		Skoda s=new Skoda();
		Renault r=new Renault();
		System.out.println(s.VehicleModel);
		System.out.println(m.Vmakername);
		System.out.println(m.carname);
		m.breaks();s.breaks();r.breaks();
		m.price();
		r.unitplace();
		
		
	}
}
