package com.bit2020.chapter03;

public class Goods {
	private String name;
	private int price;
	private int countStock;
	private int countSold;
	
	public static int countofGoods = 0;
	
	//생성자
	public Goods() {
		countofGoods++; 
	}
	
	//의도 : Goods 객체는 이름을 가져야 한다.
//	public Goods(String name) {
//		this.name = name;
//	}
	
	//2개 변수 초기화를 해주는 생성자
//	public Goods(String name, int price) { 
//		//기본 생성자 부르기
//		this();
//		this.name = name;
//		this.price = price;
//	}
	
	//4개 변수 초기화를 해주는 생성자
//	public Goods(String name, int price, int countStock, int countSold) { 
//		//2개 변수 초기화 생성자 부르기
//		this(name, price);
//		this.countStock = countStock;
//		this.countSold = countSold;
//	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public void setPrice(int price) {
		if(price < 0) {
			price = 0;
		}
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setCountStock(int countStock) {
		this.countStock = countStock;
	}
	
	public int getCountStock() {
		return countStock;
	}
	
	public void setCountSold(int countSold) {
		this.countSold = countSold;
	}
	
	public int getCountSold() {
		return countSold;
	}
	
	public void showInfo() {
		System.out.println(
			"상품이름 :" + name + 
			",가격:" + price +
			",재고개수:" + countStock + 
			",팔린 개수:" + countSold
		);
	}
	
	public int calculateDiscountPrice(double percentage) {
		return (int)(price * percentage);
	}
}