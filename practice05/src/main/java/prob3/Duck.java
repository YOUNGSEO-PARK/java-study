package prob3;

public class Duck extends Bird {

	@Override
	public void fly() {
		System.out.println("오리("+this.name+")는 날지 않습니다.");
	}

	@Override
	public void sing() {
		System.out.println("오리("+this.name+")는 소리내어 웁니다.");
	}
	
	public String toString() {
		return "오리의 "+ super.toString();
	}
}
