package com.bit2020.chapter04;

public class WrapperClassTest01 {

	public static void main(String[] args) {
		Integer i = new Integer(10);
		Character c = new Character('A');
		Boolean b = new Boolean(true);
		
		System.out.println(i);
		System.out.println(c);
		System.out.println(b);
		
		// Wrapper Class 장점
		//  
		// Auto boxing
		Integer j1 = 10;
		Integer j2 = 20;
		
		System.out.println(j1 + j2);
		System.out.println(j1 == j2); // 객체의 동일성 체크 (값이 같으므로 같다 -> constant pool때문에)
		
		// Auto Unboxing
		//int j3 = j2.intValue();  <-원래는 이렇게
		int j3 = j2;			// <- 이렇게도 가능 ; auto unboxing
		System.out.println(j2 == 20);
		System.out.println(j3);
		
	}

}
