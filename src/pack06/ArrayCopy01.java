package pack06;

public class ArrayCopy01 {

	public static void main(String[] args) {
		// 얕은 복사
		Book[] bookArr1 = new Book[3];
		Book[] bookArr2 = new Book[3];
		
		bookArr1[0] = new Book("데미안", "헤르만 해세");		
		bookArr1[1] = new Book("빨간머리앤", "몽고메리");		
		bookArr1[2] = new Book("백설공주", "그림형제");		
		
		System.out.println("=====[bookArray1 원본]=====");
		for (Book bk : bookArr1) {
			bk.print();
		}
		
		// 복사
		// 복사할 배열, 복사할 첫 위치, 대상배열, 붙여넣을 첫 위치, 복사할 요소 개수
		System.out.println("=====[bookArray2 사본]=====");

		System.arraycopy(bookArr1, 0, bookArr2, 0, 3);
		for (Book bk : bookArr2) {
			bk.print();
		}
		
		System.out.println();
		
		bookArr1[0].setName("나목");
		bookArr1[0].setAuthor("박완서");
		
		System.out.println("=====[bookArray1 원본]=====");
		for (Book bk : bookArr1) {
			bk.print();
		}
		
		System.out.println("=====[bookArray2 사본]=====");
		
		System.arraycopy(bookArr1, 0, bookArr2, 0, 3);
		for (Book bk : bookArr2) {
			bk.print();
		}
		
	}

}
