package com.techm.java.homework.naga;
public class matrixmulti {
	public static void main(String[] args) {
		int a[][] = { { 1, 2 }, { 3, 4 } };
		int b[][] = { { 2, 3 }, { 4, 5 } };
		// int c[][]=new int[2][2];
		int u = 0;int v = 0;int x = 0;int y = 0;
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				for (int k = 0; k < 2; k++) {
					for (int l = 0; l < 2; l++) {
						if (i == 0 && j == 0 && k == 0 && l == 0) {
							u = a[i][j] * b[k][l];
						} else if (i == 0 && j == 1 && k == 1 && l == 0) {
							u = u + a[i][j] * b[k][l];
						} else if (i == 0 && j == 0 && k == 0 && l == 1) {
							v = a[i][j] * b[k][l];
						} else if (i == 0 && j == 1 && k == 1 && l == 1) {
							v = v + a[i][j] * b[k][l];
						} else if (i == 1 && j == 0 && k == 0 && l == 0) {
							x = a[i][j] * b[k][l];
						} else if (i == 1 && j == 1 && k == 1 && l == 0) {
							x = x + a[i][j] * b[k][l];
						} else if (i == 1 && j == 0 && k == 0 && l == 1) {
							y = a[i][j] * b[k][l];
						} else if (i == 1 && j == 1 && k == 1 && l == 1) {
							y = y + a[i][j] * b[k][l];
						}}}}}
		System.out.print(u);
		System.out.print("  ");
		System.out.println(v);
		System.out.print(x);
		System.out.print("  ");
		System.out.println(y);
	}
}
