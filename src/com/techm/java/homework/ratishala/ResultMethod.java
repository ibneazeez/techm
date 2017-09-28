package com.techm.java.homework.ratishala;

public class ResultMethod {

	public static void main(String[] args) {
		System.out.println(checkResult(75, 89, 89));

	}

	private static String checkResult(int sub1, int sub2, int sub3) {
		int total = sub1 + sub2 + sub3;
		double avg = total / 3;
		String res = null;
		if (sub1 >= 35 && sub2 >= 35 && sub3 >= 35) {
			if (avg >= 75) {
				res = "Passed with Distinction";
			} else if (avg >= 60) {
				res = "Passed with Ist Class";
			} else if (avg >= 50) {
				res = "Passed with 2nd Class";
			} else {
				res = "Passed with 3rd Class";
			}
		} else {
			if (sub1 < 35 && sub2 < 35 && sub3 < 35)
				res = "Failed in all 3 subjects";
			else if (sub1 < 35 && sub2 >= 35 && sub3 >= 35)
				res = "Failed in Subject 1";
			else if (sub1 >= 35 && sub2 < 35 && sub3 >= 35)
				res = "Failed in Subject 2";
			else if (sub1 >= 35 && sub2 >= 35 && sub3 < 35)
				res = "Failed in Subject 3";
			else if (sub1 < 35 && sub2 < 35 && sub3 >= 35)
				res = "Failed in Subjects 1 & 2";
			else if (sub1 < 35 && sub2 >= 35 && sub3 < 35)
				res = "Failed in Subjects 1 & 3";
			else if (sub1 >= 35 && sub2 < 35 && sub3 < 35)
				res = "Failed in Subjects 2 & 3";
		}
		return res;
	}
}

