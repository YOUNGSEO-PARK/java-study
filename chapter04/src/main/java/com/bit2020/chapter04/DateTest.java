package com.bit2020.chapter04;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		Date now = new Date();
		
		System.out.println(now);
		printDate01(now);
		printDate02(now);
	}
	
	public static void printDate01(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println(sdf.format(date));
	}
	
	public static void printDate02(Date d) {
		// 년도(+1900)
		int year = d.getYear();
		
		// 월(0~11, +1)
		int month = d.getMonth();
		
		// 년도(+1900)
		int date = d.getHours();
		
		// 시
		int hour = d.getHours();
		
		// 분
		int minute = d.getMinutes();
		
		// 초
		int second = d.getSeconds();
		
		System.out.println(
				(year+1900) + "-" +
				(month+1) + "-" +
				date + " " +
				hour + ":" +
				minute + ":" +
				second
				);
	}

}
