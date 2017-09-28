package com.techm.java.homework.ratishala;

public class Composite {
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			if (i == 1)
				System.out.println(1);
			if (i != 2 && i % 2 == 0) {
				System.out.println(i);
				continue;
			}

			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					System.out.println(i);
					break;
				}
			}
		}
	}
}