package com.bit2020.chapter04;

public class StringTest02 {

	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "def";
		String s3 = s2;
		
		s2 = s1.toUpperCase();
		// 계속 사용하지 않을 것이기 때문에 
		
		 String s4 = s2.concat("@");
			// "@".charAt(index); 가능하다는 것. 실행되고 바로 사라짐
		
		String s5 = "!".concat(s2).concat("@");
		

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);		
		System.out.println(s5);
		
		//equals 메소드 주의할 점
		System.out.println(equalsHello("Hello"));
		System.out.println(equalsHello("hello"));
		System.out.println("hello".equals("Hello")+"\n");
		
		String ss = "abcbcbcb";
		String sss = "-1234";
		System.out.println(ss.length());
		System.out.println(ss.indexOf('b'));
		System.out.println(ss.substring(3,5));
		// 정규식 부호 체크(-? 뺴면 숫자인지 체크)
		System.out.println(sss.matches("-?\\d+"));
	
		
	}
	
	public static boolean equalsHello(String s) {
		return s.equals("Hello");
		
	}
}
