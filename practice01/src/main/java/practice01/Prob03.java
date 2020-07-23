package practice01;

import java.util.Scanner;

// 숫자를 입력 받아서 아래와 같은 실행결과가 나타나도록 Prob3 클래스의 main 메소드를 완성하세요 
// a. 입력 받은 숫자가 홀수인 경우에는, 0 부터 입력 값까지 홀수의 합을 출력합니다.
//	  - 예제 : 입력이 7 이면 16을 출력 ( 1 + 3 + 5 + 7 = 16 ) 
// b. 입력 받은 숫자가 짝수인 경우에는, 0 부터 입력 값까지 짝수의 합을 출력합니다.
//    - 예제 : 입력이 10 이면 30을 출력 ( 2 + 4 + 6 + 8 + 10 = 30 )

public class Prob03 {

	public static void main(String[] args) {
		int r, n;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("반복할 횟수를 입력하세요: ");
		r=sc.nextInt();
		
		for(int i=0;i<r;i++) {
			int sum=0;
			System.out.print("숫자를 입력하세요: ");
			n=sc.nextInt();
			
			if(n%2!=0) {
				for(int j=0;j<=n;j++)
					if(j%2!=0)
						sum+=j;	
			}
			else
				for(int j=0;j<=n;j++)
					if(j%2==0)
						sum+=j;	
			System.out.println("결과 값 : "+sum);
		}
		sc.close();
	}
}