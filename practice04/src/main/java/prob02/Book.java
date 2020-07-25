package prob02;

public class Book {
	int bookNo, stateCode;
	String title, author;
	
	public Book(int bookNo, String title, String author) {
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
		stateCode = 1;
	}
	public void rent() {
		stateCode = 0;
		System.out.println(title + "이(가) 대여 되었습니다.");
	}
	public void print() {
		System.out.print("책 제목:" + title + ", 작가:" + author + ", 대여유무:");
		if(stateCode == 1)
			System.out.println("재고 있음");
		else if(stateCode == 0)
			System.out.println("대여중");
	}
	public int getBookNo() {
		return bookNo;
	}
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
}
