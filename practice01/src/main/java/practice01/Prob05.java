package practice01;

public class Prob05 {

// 반복문을 이용하여 369게임에서 박수를 쳐야 하는 경우의 수를 순서대로 화면에 출력해보세요. 
// 1부터 99까지만 실행하세요.
	public static void main(String[] args) {

		char s='짝';
		
		for(int i=1;i<100;i++) {
			if(i<10) {
				if(i%3==0)
					System.out.print(i+" "+s+"\n");
			}
			else {
			int a = i/10;
			int b = i-a*10;
			if(b!=0) {
				if(a%3==0 && b%3==0) 
					System.out.print(i+" "+s+s+"\n");
				
				else if(a%3==0 || b%3==0) 
					System.out.print(i+" "+s+"\n");
				}
			else
				if(a%3==0) 
					System.out.print(i+" "+s+"\n");
			}
		}
	}
}