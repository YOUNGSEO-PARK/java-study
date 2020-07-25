package com.bit2020.chapter03.swap;

public class SwapTest01 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		System.out.println(a+":"+b);
		
		int tmp = a;
		a = b;
		b = tmp;
		
		System.out.println(a+":"+b);
		
	}

}
