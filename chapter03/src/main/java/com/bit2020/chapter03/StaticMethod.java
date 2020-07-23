package com.bit2020.chapter03;

public class StaticMethod {
	int n;
	static int m;
	
	void f1() {
		System.out.println(n);
	}
	
	void f2() {
		System.out.println(StaticMethod.m);
		
		// 같은 클래스의 클래스 변수의 접근시 클래스 이름은 생략이 가능하다.
		System.out.println(m);
	}
	
	void f3() {
		f2();
	}
	
	void f4() {
		StaticMethod.s1();
		
		// 같은 클래스의 클래스 메소드의 접근시 클래스 이름은 생략이 가능하다.
		s1();
	}
	
	static void s1() {
		// 오류 : static method에서는 인스턴스 변수에 접근할 수 없다.
		// System.out.println(n);
	}
	
	static void s2() {
		System.out.println(StaticMethod.m);

		// 같은 클래스의 클래스 변수의 접근시 클래스 이름은 생략이 가능하다.
		System.out.println(m);
	}
	
	static void s3() {
		// 오류 : static method에서는 인스턴스 메소드에 접근할 수 없다.
		// f2();
	}
	
	static void s4() {
		StaticMethod.s2();
		
		// 같은 클래스의 클래스 메소드의 접근시 클래스 이름은 생략이 가능하다.
		s2();
	}
	
	public static void main(String[] args) {
		GoodsApp.i=20; //전역변수는 클래스 이름으로 접근
		GoodsApp.test();
	}
	
}
