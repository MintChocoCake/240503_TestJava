package pack06;

public class BookMain {

	public static void main(String[] args) {
		
		Book myBook1 = new Book();
		Book myBook2 = new Book("데미안", "헤르만 해세");
		
		System.out.println("book1");
		myBook1.print();
		System.out.println("book2");
		myBook2.print();
		
		Book[] libary = new Book[5];
		
		libary[0] = new Book("책1", "저자1");
		libary[1] = new Book("책2", "저자2");
		libary[2] = new Book("책3", "저자3");
		libary[3] = new Book("책4", "저자4");
		libary[4] = new Book("책5", "저자5");
		
		for (Book book : libary) {
			book.print();
		}
		
		System.out.println("===============");
		
		Book bk = new Book();
		
		bk.setName("자바의 정석");
		bk.setAuthor("남궁선");
		
		System.out.println("이름 : " + bk.getName());
		System.out.println("저자 : " + bk.getAuthor());
		
		
		
	}

}
