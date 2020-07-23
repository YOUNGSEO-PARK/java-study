package com.bit2020.paint.main;

import com.bit2020.paint.i.Drawable;
import com.bit2020.paint.point.ColorPoint;
import com.bit2020.paint.point.Point;
import com.bit2020.paint.shape.Circle;
import com.bit2020.paint.shape.Rect;
import com.bit2020.paint.shape.Shape;
import com.bit2020.paint.shape.Triangle;
import com.bit2020.paint.text.GraphicText;

public class MainApp {

	public static void main(String[] args) {
		Point point1 = new Point();
		point1.setX(100);
		point1.setY(200);
		
		Point point2 = new Point(50, 50);
		
		//drawPoint(point1);
		draw(point1);
		//drawPoint(point2);
		draw(point2);
		
		point1.show(false);
		
		System.out.println("//=================================");

		//업캐스팅 : int-> double
		Point point3 = new ColorPoint();
		point3.setX(30);
		point3.setY(100);
		//캐스팅
		ColorPoint p3 = (ColorPoint)point3;
		//다운 캐스팅, 우선순위 때문에 괄호사용
		((ColorPoint)point3).setColor("red");
		
		//drawPoint(point3);
		draw(point3);
		
		Point point4 = new ColorPoint(10, 20, "yellow");
		draw(point4);
		
		System.out.println("//=================================");
		Rect rect = new Rect();
		//drawShape(rect);
		draw(rect);
		
		System.out.println("//=================================");
		Triangle triangle = new Triangle();
		//drawShape(triangle);
		draw(triangle);
		
		System.out.println("//=================================");
		Circle circle = new Circle();
		//drawShape(circle);
		draw(circle);
		
		System.out.println("//=================================");
		draw(new GraphicText("Hello"));
		
		System.out.println("//==================instanceof 연산자1===============");
		System.out.println(circle instanceof Circle); 
		System.out.println(circle instanceof Shape);
		System.out.println(circle instanceof Object); 
		System.out.println(circle instanceof Drawable); 
		// 오류: 타입이 class인 레퍼런스 변수인 경우,
		// 		Hierachy 구조에서 상위, 하위 클래스만 instanceof 연산자를 사용할 수 있다.
		// System.out.println(circle instanceof Rect); 
		
		System.out.println("//==================instanceof 연산자2===============");
		Shape s = new Circle();
		System.out.println(s instanceof Circle); 
		System.out.println(s instanceof Triangle);
		System.out.println(s instanceof Object); 
		System.out.println(s instanceof Drawable); 
		
		System.out.println("//==================instanceof 연산자3===============");
		// 타입이 Interface 구현 여부를 확인할 경우,
		// Hierachy 구조와 상관없이 instanceof 연산자를 사용할 수 있다.
		System.out.println(s instanceof Drawable);
		System.out.println(s instanceof Runnable);
	}
	public static void draw(Drawable drawable) {
		drawable.draw();
	}

//	public static void drawPoint(Point pt) {
//		//pt.show(false);
//		pt.show();
//	}
//	public static void drawShape(Shape shape) {
//		shape.draw();
//	}
	
//	public static void drawRect(Rect rect) {
//		rect.draw();
//	}
//	public static void drawTriangle(Triangle triangle) {
//		triangle.draw();
//	}
	
}
