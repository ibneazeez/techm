package com.techm.java.homework.inter.keerthi;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.techm.java.homework.keerthi.Mobile;

public class CitizenWatch implements Watch {

	public static void main(String[] args) {

		ParentFromDiffPack parent = new ParentFromDiffPack();

		Mobile mb = new Mobile();
		mb.answering();
		mb.type = "brand";

	}

	public void time() {

		DateTimeFormatter dtf = DateTimeFormatter
				.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		System.out.println(dtf.format(now));

	}

	public void changeTime() {

	}

}
