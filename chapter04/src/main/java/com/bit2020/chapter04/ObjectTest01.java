package com.bit2020.chapter04;

public class ObjectTest01 {

	public static void main(String[] args) {
		Point p = new Point(10, 20);
		
		Class klass = p.getClass();
		System.out.println(klass);        // reflection
		System.out.println(p.hashCode()); // reference value   x
										  // address           x
										  // address 기반의 해싱값  o
		System.out.println(p);
		System.out.println(p.toString()); // getClass() + "@" + hashCode()
	}
	
}
