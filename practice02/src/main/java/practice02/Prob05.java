package practice02;

import java.util.Random;
import java.util.Scanner;

public class Prob05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		while(true) {
		int start = 1, end = 100, cnt = 1, n;
		Random r = new Random();
		int k = r.nextInt(100) + 1;
		
		System.out.println("수를 결정하였습니다. 맞추어보세요.");
		
		while(true) {
		System.out.println(start+"-"+end);
		System.out.print(cnt+">>");
		n=sc.nextInt();
			if(n > k) {
				System.out.println("더 낮게");
				end=n;
			}
			if(n < k) {
				System.out.println("더 높게");
				start=n;
			}
			if(n==k) {
				System.out.println("맞았습니다.\n");
				System.out.println("다시하시겠습니까(y/n)>>");
				String answer = sc.next();
				if( answer.equals("y") ) 
				    break;
				else
					return;
			}
			cnt++;
			}
		}
	}
}
