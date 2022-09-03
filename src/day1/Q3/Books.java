package day1.Q3;

public class Books implements Comparable<Books>{

	private int bookId;
	private String bookName;
	private String BookAuthor;
	
	
	
	
	
	
	
	public Books(int id, String name, String auther) {
		// TODO Auto-generated constructor stub
		this.setBookId(id);
		this.setBookName(name);
		this.setBookAuthor(auther);
	}
	
	
	
	@Override
	public String toString() {
		return "Books [bookId=" + bookId + ", bookName=" + bookName + ", BookAuthor=" + BookAuthor + "]";
	}



	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookAuthor() {
		return BookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		BookAuthor = bookAuthor;
	}



	@Override
	public int compareTo(Books o) {
		// TODO Auto-generated method stub
		int b1 = o.getBookId();
		int b2 = this.getBookId();
		if(b1>b2) {
			return +1;
		}else if(b1<b2) {
			return -1;
		}
		return 0;
	}
	
}
