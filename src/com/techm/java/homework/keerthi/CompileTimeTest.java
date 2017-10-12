package com.techm.java.homework.keerthi;

public class CompileTimeTest {

	public static void main(String[] args) {
		add(8, 4);
	}
	public static void add(int a, float b){
		float c=a/b;
		System.out.println(c);
	}
	public static void add(int a, float b,int c){
		float cr=a/b;
		System.out.println(cr);
	}
	public static void add(int a, int b){
	int c=a/b;
	System.out.println(c);
	}
	
}
