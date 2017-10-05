/**
 * 
 */
package com.techm.java.homework.naga;

/**
 * @author nagendra
 *
 */
public class MarksGrading {

	public static void main(String[] args) {

		int eng = 10, math = 95, java = 90, python = 41;
		int total = eng + math + java + python;
		float per = total / 4;

		if (eng >= 40 && math >= 40 && java >= 40 && python >= 40) {
			System.out.println("Passed In All Subjects");
		} else if (eng < 40) {
			System.out.println("Failed in Eng");
		}
		if (math < 40) {
			System.out.println("Falied in math");
		}
		if (java < 40) {
			System.out.println("Failed in java");
		}
		if (python < 40) {
			System.out.println("Failed in Python");
		}

		if (eng >= 40 && math >= 40 && java >= 40 && python >= 40)
			if (per >= 70) {
				System.out.println("First Class and Congrats");
			} else if (per >= 50 && per < 70) {
				System.out.println("Second Class and improve some more");
			} else if (per >= 40 && per < 50) {
				System.out.println("Just Passed and work hard");
			}

	}

}
