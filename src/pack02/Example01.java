package pack02;

import java.util.Scanner;

public class Example01 {

	public static void main(String[] args) {
		// 534개의 책을 학생 30명에게 똑같은 갯수로 나눠줄 때,
		// 학생당 몇개씩 가지고, 최종적으로 남는 갯수
		
		int book = 534;
		int student = 30;
		
		// 학생 한명이 가지는 책의 수
		int oneStuBook = book / student;
		// 남은 책의 수
		int keepBook = book % student;
		
		System.out.println("한명당 분배된 책 : " + oneStuBook);
		System.out.println("남은 책 : " + keepBook);
		
		System.out.println("===============");

		Scanner scan = new Scanner(System.in);
		
		System.out.print("책을 분배할 교실 이름 : " );
		String className = scan.next();	
		
		System.out.print("책 수량 입력 : ");
		int books = scan.nextInt();
		
		System.out.print("학생 수 입력 : ");
		int students = scan.nextInt();
		
		// 학생 한명이 가지는 책의 수
		int equallyDivided = books / students;
		// 남은 책의 수
		int remainBook = books % students;
		
		System.out.println("[" + className + "교실 책 분배 현황]");
		System.out.println("한명당 분배된 책 : " + equallyDivided);
		System.out.println("남은 책 : " + remainBook);
		
		scan.close();
	}

}
