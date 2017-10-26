package com.techm.java.classwork.oct26.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class TestCollections {
	
	
	
	public static void main(String[] args) {
		
		Box box[] = new Box[10];
		box[0] = new Box(10, 20, 30);
		
		
		ArrayList list = new ArrayList();
		HashSet set = new HashSet();
		
		Box box1 = new Box(10, 10, 12);
		Box box2 = new Box(10, 10, 13);
		Box box3 = new Box(10, 10, 14);
		Box box4 = new Box(10, 10, 15);
		Box box5 = new Box(10, 10, 12);
		list.add(box1);
		list.add(box2);
		list.add(box3);
		list.add(box4);
		list.add(box5);
		
		
		
		Iterator listItr = list.iterator();
		
		
		/*while(listItr.hasNext()){
			System.out.println(listItr.next());
			
		}
		
		System.out.println(listItr.next());
		//System.out.println(list.get(0));
		*/
		
		
		set.add(box1);
		set.add(box2);
		set.add(box3);
		set.add(box4);
		set.add(box5);
		
		
		
		
		listItr = set.iterator();
		
		while(listItr.hasNext()){
			Box b1 = (Box) listItr.next();
			if(b1.getHeight()==12){
				listItr.remove();
			}
			//System.out.println(listItr.next());
			
		}
		
		System.out.println(set);
		
		
		//System.out.println(list);
		
		
		
		
		//Set,
		/**
		 *  it will unordered.. 
		 *  it will not alloow duplicates.. 
		 */
		//List
		// Ordered 
		// it will allow duplciate values
		
		
		// MAP
		// Key , value Pairs
		// SET,  List
		
		
		
		
		
		
		
		
	}

}
