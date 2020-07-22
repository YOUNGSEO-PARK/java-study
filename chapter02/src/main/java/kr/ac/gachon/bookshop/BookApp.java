package kr.ac.gachon.bookshop;

public class BookApp {
	private static int bookCount = 0;
	
	public void test() {
	}
	
	public static void main(String[] args) {
		Book b = new Book();
		Book a = b;
		for(int i = 0; i < 10; i++) {
			Book c = new Book();
		}
		System.out.println(a);
	}

}
