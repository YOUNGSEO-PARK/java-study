package prob03;

public class CurrencyConverter {
	//static 멤버 접근은 static만 됨
	private static double rate;
	
	public static double toDollar(double won) {
		return won/rate;
	}
	
	public static double toKRW(double dollar) {
		return dollar*rate;
	}

	public static void setRate(double rate) {
		CurrencyConverter.rate = rate;
	}
	
	
}
