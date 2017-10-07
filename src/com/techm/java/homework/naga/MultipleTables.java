package com.techm.java.homework.naga;

public class MultipleTables {
	public static void main(String[] args) {
		System.out.println("Below are the Tables from 1 to 10 :");

		int i = 1;

		for (; i <= 10; i++){
			System.out.println("Printing Table--"+i);
			for (int j = 1; j <= 20; j++)
				
				System.out.println(i + "*" + j + " =" + i * j);

	}
	}
}
