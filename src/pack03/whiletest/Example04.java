package pack03.whiletest;

import java.util.Scanner;

public class Example04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		boolean run = true;
		int save = 0; // 예금, 출금, 조회
		int money = 0;
		int num1 = 0, num2 = 0;
		
		while (run) {
			System.out.println("=====[메뉴]=====");
			System.out.println("0.[종료] 1.[예금] 2.[출금] 3.[조회]");
			System.out.print("선택 : ");
			num1 = sc.nextInt();
			
			if (0 == num1) 
				run = false;
			else if (1 == num1) {
				System.out.println("=====[예금]=====");
				System.out.println("[메뉴로 : 0]  [잔액 : " + save + "]");
				System.out.print("예금 : ");
				money = sc.nextInt();
				
				if (0 == money) 
					continue;
				else if (0 > money) {
					System.out.println("잘못된 입력입니다.");
					continue;
				} 
				
				save += money;
			}
			else if (2 == num1) {
				System.out.println("=====[출금]=====");
				System.out.println("[메뉴로 : 0]  [잔액 : " + save + "]");
				System.out.print("출금 : ");
				money = sc.nextInt();
				
				if (0 == money) 
					continue;
				else if (0 > money) {
					System.out.println("잘못된 입력입니다.");
					continue;
				} 
				
				if (save < money) {
					System.out.println("잔액이 부족합니다.");
					continue;
				} 
				
				save -= money;
			}
			else if (3 == num1) 
				System.out.println("[잔액 : " + save + "]");
			else 
				System.out.println("잘못된 입력입니다.");
			
		}
		
		System.out.println("프로그램 종료.");
		sc.close();
		
	}

}
