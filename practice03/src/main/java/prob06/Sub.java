package prob06;

public class Sub {
	int a;
	int b;
	
	public Sub(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public int calculate() {
		return a-b;
	}
}
