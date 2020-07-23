package com.bit2020.paint.shape;

import com.bit2020.paint.i.Drawable;

public abstract class Shape implements Drawable { // Shape에서  Drawable 구현을 못함 -> 추상
	private String lineColor;
	private String fillColor;
	
	public String getLineColor() {
		return lineColor;
	}
	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}
	
	public abstract int calcPerimeter(); // 추상메소드
}





