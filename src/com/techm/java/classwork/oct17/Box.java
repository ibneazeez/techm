package com.techm.java.classwork.oct17;

public class Box {

	private int length;
	private int height;
	private int width;


	public Box() {

		length =10;
		width = 20;
		height= 30;
	}
	
	
	

	public int getLength() {

		return length;
	}

	public Box(int length, int height, int width) {
		this.length = length;
		this.height = height;
		this.width = width;
	}

	
	public Box(Box b1) {
		this.length = b1.length;
		this.height = b1.height;
		this.width = b1.width;
	}

	
	public void setLength(int length) {

		this.length = length;
	}
	public int getHeight() {

		return height;
	}
	public void setHeight(int height) {

		this.height = height;
	}
	public int getWidth() {

		return width;
	}
	public void setWidth(int width) {

		this.width = width;
	}



	@Override
	public String toString() {
		return "Box [length=" + length + ", height=" + height + ", width=" + width + "]";
	}
	
	
	public void reset(Box b){
		
		b.height=-1;
		b.width=-1;
		b.length=-1;
		
	}




}
