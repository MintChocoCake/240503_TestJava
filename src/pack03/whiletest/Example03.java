package pack03.whiletest;

import java.util.Scanner;

public class Example03 {

	public static void main(String[] args) {
		boolean run = true;
		int balance = 0; // 예금, 출금, 조회
		
		Scanner sc = new Scanner(System.in);
		
		while (run) {
			System.out.println("=====[메뉴]=====");
			System.out.println("0.[종료] 1.[예금] 2.[출금] 3.[조회]");
			System.out.print("선택 : ");
			int menuNum = sc.nextInt();
			
			// nextLine() : 개행문자를 제외한 문자열을 가져온다. 
			// (ex.) "hello" + 엔터 입력 시 입력된 문자열만 가져오고 내부적으로 엔터가 남아 있어 이후 입력값에 영향을 줌 
			// next()로 받으면 개행문자를  포함하고 가져오기 떄문에 문제없음.
			// int test1 = Integer.parseInt(sc.nextLine());
			// int test1 = Integer.parseInt(sc.next());
			// int test2 = sc.nextInt(); -> 이전에 nextLine() 으로 입력받을때 엔터가 남아있으면 에러 
			
			int Money = 0;
			
			switch (menuNum) {
			case 0:
				run = false;
				break;
			case 1:
				System.out.println("=====[예금]=====");
				System.out.println("[메뉴로 : 0]  [잔액 : " + balance+ "]");
				System.out.print("예금 금액 : ");
				Money = sc.nextInt();
				sc.nextInt(); // 내부적 찌꺼기 제거?
				if (0 >= Money) {
					if (0 != Money)
						System.out.println("잘못된 입력입니다.");
					break;
				}
				balance += Money; 
				break;
				
			case 2:
				System.out.println("=====[출금]=====");
				System.out.println("[메뉴로 : 0]  [잔액 : " + balance+ "]");
				System.out.print("출금 금액 : ");
				Money = sc.nextInt();
				if (0 >= Money) {
					if (0 != Money)
						System.out.println("잘못된 입력입니다.");
					break;
				}
				if (Money > balance) {
					System.out.println("잔액이 부족합니다.");
					break;
				}
				balance -= Money; 
				break;
				
			case 3:
				System.out.println("[잔액 : " + balance + "]");
				break;
			default:
				break;
			}
			
		}
		
		System.out.println("프로그램 종료.");
		sc.close();
		
	}

}
