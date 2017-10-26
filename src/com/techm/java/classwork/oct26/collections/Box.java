package com.techm.java.classwork.oct26.collections;

public class Box {

	private int width;
	private int lenght;
	private int height;

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getLenght() {
		return lenght;
	}

	public void setLenght(int lenght) {
		this.lenght = lenght;
	}

	public int getHeight() {
		return height;
	}

	@Override
	public String toString() {
		return "Box [width=" + width + ", lenght=" + lenght + ", height=" + height + "]";
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public Box(int width, int lenght, int height) {
		super();
		this.width = width;
		this.lenght = lenght;
		this.height = height;
	}
	
	

}
