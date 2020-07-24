package prob02;

import java.util.Scanner;

public class Prob02 {
	private static final int COUNT_GOODS = 3;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//객체 배열
		Goods[] goods = new Goods[COUNT_GOODS];
		
		for(int i=0;i<COUNT_GOODS;i++) {
			String line = sc.nextLine();
			String[] token = line.split(" ");
			
			goods[i] = new Goods();
			
			goods[i].name =	token[0];
			goods[i].price = Integer.parseInt(token[1]);
			goods[i].stock = Integer.parseInt(token[2]);
			
			System.out.println(goods[i].name
					+"(가격:"+goods[i].price+"원)이 "
					+goods[i].stock+"개 입고되었습니다.");
		}
		sc.close();
	}	
}
