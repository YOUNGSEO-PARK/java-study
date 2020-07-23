package com.bit2020.chapter03.person;

public class TestStudent {
	public static void main(String[] args) {
		Student s = new Student();
		
		Person p = s;
		Student s2 = (Student)p;
	}
}
