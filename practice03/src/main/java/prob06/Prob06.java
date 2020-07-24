package prob06;

import java.util.Scanner;

public class Prob06 {

	public static void main(String[] args) {
		int a, b;
		String s, q;
		
		Scanner sc = new Scanner(System.in);
		
		
		//String s는 객체 이므로 == 아니고 s.equals 사용
		while(true) {
			System.out.print(">> ");
			a = sc.nextInt();
			s = sc.next();
			b = sc.nextInt();
			
			if(s.equals("+")) {
				Add add = new Add(a, b);
				System.out.print(">> " + add.calculate() + "\n");
			}
			else if(s.equals("-")) {
				Sub sub = new Sub(a, b);
				System.out.print(">> " + sub.calculate() + "\n");
			}
			else if(s.equals("*")) {
				Mul mul = new Mul(a, b);
				System.out.print(">> " + mul.calculate() + "\n");
			}
			else if(s.equals("/")) {
				Div div = new Div(a, b);
				System.out.print(">> " + div.calculate() + "\n");
			}
			
			q = sc.next();
			// 그만두려면 quit 입력
			if(q.equals("quit")) 
				break;
			else
				continue;
		}
	}
}
