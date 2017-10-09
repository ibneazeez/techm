package com.techm.java.homework.naga;

public class matrixprint {
	public static void main(String[] args) {

	int a[][]={{1,2},{3,4},{5,6},{7,8}};
	
	//System.out.println(a[3][0]);
	
	for (int i=0;i<4;i++){
		for(int j=0;j<2;j++){
			System.out.print("("+i+")"+"("+j+")"+a[i][j]);
			System.out.print("  ");
		}
		System.out.println();
	}
	
}
}
