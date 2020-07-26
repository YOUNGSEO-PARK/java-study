package prob6;

public class RectTriangle extends Shape {
	
	RectTriangle(double w, double h){
		
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getPerimeter() {
		return width + height + Math.sqrt(width*width + height*height);
	}

}
