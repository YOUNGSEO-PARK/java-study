package com.bit2020.chapter04;

public class StringTest03 {

	public static void main(String[] args) {
		String str = "Hello" + "World" + "Java" +1000;
		
		// a.k.a 체인 
		String s = new StringBuffer("Hello")
						.append("World")
						.append("Java")
						.append(1000)
						.toString();
		
		System.out.println(str +"\n" + s);
		
		// 주의 문자열 + 연산 -> 연산이 늘어나면 너무 느림
		String str2 = "";
		String str3 = "";
		
		// 메모리 할당이 있어서 느림
//		for(int i = 0; i<100000; i++) {
//			//str2 +=i;	
//			str2 = new StringBuffer(str2).append(i).toString();
//		}
//		
		// 연산 빠름 
		StringBuffer sb = new StringBuffer("");
		for(int i = 0; i<10000000; i++) {
			sb.append(i);  // 메소드 호출만
		}
		str3 = sb.toString();
		
		// System.out.println(str2.length()); //느려!!
		 System.out.println(str3.length());
		
	}

}
