package prob3;

public abstract class Bird {
	protected String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "이름은 " + this.name +" 입니다.";
	}
	
	public abstract void fly();
	public abstract void sing();
}
