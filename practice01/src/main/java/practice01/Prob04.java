package practice01;

import java.util.Scanner;

// 문자열을 입력 받아서 아래와 같은 실행결과가 나타나도록 Prob4 클래스의 main 메소드를  완성하세요. 
// 입력 받은 문자열을 한 글자씩 증가시키며 출력하는 프로그램입니다.

public class Prob04 {

	public static void main(String[] args) {
		String s1, s2;
	
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하세요. : ");
		s1 = sc.nextLine();
		for(int i=1;i<=s1.length();i++) {
			s2=s1.substring(0,i);
			System.out.println(s2);
		}
		sc.close();
	}
}