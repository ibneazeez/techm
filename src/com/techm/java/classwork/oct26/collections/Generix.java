package com.techm.java.classwork.oct26.collections;

import java.util.ArrayList;
import java.util.List;
import com.techm.java.classwork.oct26.collections.Box;

public class Generix {
	
	public static void main(String[] args) {
		
		List<Box> l = new ArrayList<Box>();
		
		Box box1 = new Box(10, 10, 12);
		Box box2 = new Box(10, 10, 13);
		Box box3 = new Box(10, 10, 14);
		Box box4 = new Box(10, 10, 15);
		Box box5 = new Box(10, 10, 12);
		
		l.add(box1);
		
		Box box = l.get(1);
		
		
	}
	

}
