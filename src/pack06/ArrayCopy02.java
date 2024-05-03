package pack06;

public class ArrayCopy02 {

	public static void main(String[] args) {
		// 얕은 복사
		Book[] bookArr1 = new Book[3];
		Book[] bookArr2 = new Book[3];

		bookArr1[0] = new Book("데미안", "헤르만 해세");
		bookArr1[1] = new Book("빨간머리앤", "몽고메리");
		bookArr1[2] = new Book("백설공주", "그림형제");

		bookArr2[0] = new Book();
		bookArr2[1] = new Book();
		bookArr2[2] = new Book();

		System.out.println("=====[bookArray1 원본]=====");
		for (Book bk : bookArr1) {
			bk.print();
		}

		System.out.println("=====[bookArray2 원본]=====");
		for (Book bk : bookArr2) {
			bk.print();
		}
		System.out.println();
		
		// bookArr1 배열 요소를 새로 생선한 bookArr2 배열 인스턴스에 복사
		for (int i = 0; i < bookArr1.length; i++) {
			bookArr2[i].setName(bookArr1[i].getName());
			bookArr2[i].setAuthor(bookArr1[i].getAuthor());
		}
		
		//bookArr2[0] = bookArr1[0];
		
		bookArr1[0].setName("나목");
		bookArr1[0].setAuthor("박완서");
		
		System.out.println("=====[bookArray1 원본 변경]=====");
		for (Book bk : bookArr1) {
			bk.print();
		}

		System.out.println("=====[bookArray2 원본 변경]=====");
		for (Book bk : bookArr2) {
			bk.print();
		}
		
		
		
	} // main

} // class
