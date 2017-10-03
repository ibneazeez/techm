package com.techm.java.homework.anudeep;

class Human1 
{
	String name="X";
	String Gender="M/F";
	void college()
	{
		System.out.println("SRM");
	}

}
class student extends Human1
{
	int sid=1;
	void fee()
	{
		System.out.println("the fee for semister:"+10000);
	}
	
	
	
}
class employee extends Human1
{
	int eid=2;
	void sal()
	{
		System.out.println("salary is "+20000);
	}
}

class Human
{
public static void main(String[] args) 
{
	student s=new student();
	employee e=new employee();
	System.out.println(s.sid);
	System.out.println(e.eid);
	System.out.println(s.name);
	e.college();
	s.college();
	e.sal();
	s.fee();
	
}
}