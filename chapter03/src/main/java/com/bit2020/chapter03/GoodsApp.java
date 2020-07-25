package com.bit2020.chapter03;

public class GoodsApp {
	public static int i;

	public static void main(String[] args) {
		
		Goods camera = new Goods();
		
		camera.setName("nikon");
		camera.setPrice(200000);
		camera.setCountSold(20);
		camera.setCountStock(30);
		
//		Goods camera1 = new Goods();
//		Goods camera2 = new Goods();
//		Goods camera3 = new Goods();
		
		camera.showInfo();
		System.out.println(camera.calculateDiscountPrice(0.5));
	}

	public static void test() {
	}

}
