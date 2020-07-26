package com.bit2020.chapter04;

public class StringTest01 {

	public static void main(String[] args) {
		// c:\temp
		String s = "c:\\temp";
		System.out.println(s);
		
		String ss = "hi";
		// 모두 대문자로 바꿔줌 
		String ss2 = ss.toUpperCase();
		System.out.println(ss2);
		
		System.out.println("\"hello\"");
		
		// 제어문자
		// \t -> tab
		// \n -> new line(개행)
		// \r -> carriage reutrn
		
		System.out.println("hello");
		System.out.println("hello\n");
		System.out.println("hello\r\n");
		
		char c = '\'';
		System.out.println(c);
	}
			
}
