package practice01;

import java.util.Scanner;

// 입력된 수가 3의 배수인지 판별하는 프로그램을 작성하세요.
public class Prob01 {

	public static void main(String[] args) {
		int n;
		
		System.out.print("수를 입력하시오 : ");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		if(n%3==0)
			System.out.println("3의 배수입니다.");
		
		sc.close();
	}
}