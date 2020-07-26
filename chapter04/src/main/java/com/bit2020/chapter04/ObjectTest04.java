package com.bit2020.chapter04;

public class ObjectTest04 {

	public static void main(String[] args) {
		String s1 = new String("ABC");
		String s2 = new String("ABC");
		
		// 레퍼런스 값이 다르기 때문에 false
		System.out.println(s1 == s2);
		
		// 두 String의 내용이 같기 때문에 true (Point-내용기반 오버라이드)
		System.out.println(s1.equals(s2));
		
		//두개 내용이 같으니까 해시 코드도 같음 (Point-내용기반 오버라이드)
		System.out.println(s1.hashCode() + ":" + s2.hashCode());
		
		// 오버라이드 된 것 말고 부모 객체의 주소기반의 해시 값은 다르기 때문에 해시코드가 다름
		System.out.println(System.identityHashCode(s1) + ":" + System.identityHashCode(s2));

		System.out.println("=======================================");
		
		Boolean b = true;
		Integer i = 10;
		
		String s3 = "ABC"; // => new String("ABC");O
		String s4 = "ABC"; // => new String("ABC"); X
		f1(s3);
		f2(s4);
		System.out.println(s3 == s4);
		System.out.println(s3.equals(s4));
		System.out.println(s3.hashCode() + ":" + s4.hashCode());
		System.out.println(System.identityHashCode(s3) + ":" + System.identityHashCode(s4));
		
		String s5 = "Hello"; // new String("Hello")
	}
	
	static void f1(String s) {}
	static void f2(String s) {}
	
}
