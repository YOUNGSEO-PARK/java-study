package com.bit2020.paint.point;

public class ColorPoint extends Point {
	private String color;
	public ColorPoint() {
		
	}
	public ColorPoint (int x, int y, String color) {
//1.	setX(x);
//2.		setY(y);
//1. 2. 보다 더 세련된 방식
		super(x,y);
		
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public void show() {
		System.out.println("점[x=" + getX() + 
				", y=" + getY() + 
				", color="+color+
				"]을 그렸습니다.");
	}
}
