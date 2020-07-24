package practice02;

import java.util.Scanner;

public class Prob01 {
	private static final int CNT = 10;
	public static void main(String[] args) {
		
		int price;
		int[] change = new int[CNT];
		int[] money = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};
		
		Scanner sc = new Scanner(System.in);
	
		System.out.print("금액: ");
		price = sc.nextInt();
		
		if(price>=money[0]) {
			for(int i=1;price>=money[0];i++) {
			price-=money[0];
			change[0]=i;
			}
		}
		if(price>=money[1]) {
			for(int i=1;price>=money[1];i++) {
			price-=money[1];
			change[1]=i;
			}
		}
		if(price>=money[2]) {
			for(int i=1;price>=money[2];i++) {
			price-=money[2];
			change[2]=i;
			}
		}
		if(price>=money[3]) {
			for(int i=1;price>=money[3];i++) {
			price-=money[3];
			change[3]=i;
			}
		}
		if(price>=money[4]) {
			for(int i=1;price>=money[4];i++) {
			price-=money[4];
			change[4]=i;
			}
		}
		if(price>=money[5]) {
			for(int i=1;price>=money[5];i++) {
			price-=money[5];
			change[5]=i;
			}
		}
		if(price>=money[6]) {
			for(int i=1;price>=money[6];i++) {
			price-=money[6];
			change[6]=i;
			}
		}
		if(price>=money[7]) {
			for(int i=1;price>=money[7];i++) {
			price-=money[7];
			change[7]=i;
			}
		}
		if(price>=money[8]) {
			for(int i=1;price>=money[8];i++) {
			price-=money[8];
			change[8]=i;
			}
		}
		if(price>=money[9]) {
			for(int i=1;price>=money[9];i++) {
			price-=money[9];
			change[9]=i;
			}
		}
		
		for(int j=0;j<CNT;j++)
			System.out.println(money[j]+"원 : "+change[j]+"개");	
		sc.close();
	}
}
