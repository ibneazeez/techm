package com.techm.java.classwork.oct17;

public class ChildBox extends Box {

	private int area;


	public int getArea() {
		return area;
	}


	public void setArea(int area) {
		this.area = area;
	}


	public ChildBox() {

		super(0, 0, 0);

		// TODO Auto-generated constructor stub
	}


	public ChildBox(int length, int height, int width, int area) {
		this.area = area;
	}


	public ChildBox(ChildBox childBox){
		this.area = childBox.area;
	}







}
