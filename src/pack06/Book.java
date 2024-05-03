package pack06;

public class Book {
	
	public String bookName = "";
	public String author = "";
	
	public Book() {
		
	}
	public Book(String _name, String _author) {
		this.bookName = _name;
		this.author = _author;
	}
	
	public void setName(String _name) {
		this.bookName = _name;
	}
	public void setAuthor(String _author) {
		this.author = _author;
	}
	public void setInfo(String _name, String _author) {
		this.bookName = _name;
		this.author = _author;
	}
	
	public String getName() {
		return this.bookName;
	}
	public String getAuthor() {
		return this.author;
	}
	
	public void print() {
		System.out.println("책이름 : " + this.bookName + " | 저자 : " + this.author);
	}
	
	
	
}
