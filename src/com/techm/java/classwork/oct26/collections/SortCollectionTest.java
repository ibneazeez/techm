package com.techm.java.classwork.oct26.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class SortCollectionTest {
	
	public static void main(String[] args) {
		
		
		/*List list = new ArrayList<>();
		
		list.add(1);
		list.add(4);
		list.add(2);
		list.add(3);
		
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);*/
		
		
		ArrayList list = new ArrayList();
		HashSet set = new HashSet();
		
		Box box1 = new Box(10, 10, 12);
		Box box2 = new Box(10, 10, 13);
		Box box3 = new Box(10, 10, 11);
		Box box4 = new Box(10, 10, 1);
		Box box5 = new Box(10, 10, 12);
		
		list.add(box1);
		list.add(box2);
		list.add(box3);
		list.add(box4);
		list.add(box5);
		
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		
	}

}
