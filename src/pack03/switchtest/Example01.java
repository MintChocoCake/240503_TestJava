package pack03.switchtest;

import java.util.Scanner;

public class Example01 {

	public static void main(String[] args) {
		// 사용자로 부터 월을 입력받아, 해당 월의 계절을 출력하는 프로그램
		// 봄 3~5 , 여름 6~8 , 가을 9~11 , 겨울 12 ~ 2

		Scanner sc = new Scanner(System.in);
		int month = 0;
		String msg = "";
		
		while (0 == month) {
			System.out.print("계절 계산기 : ");
			month = sc.nextInt();
			
			switch (month) {
			case 3: case 4: case 5:
				msg = month + "월 : 봄 입니다.";
				break;

			case 6: case 7: case 8:
				msg = month + "월 : 여름 입니다.";
				break;

			case 9: case 10: case 11:
				msg = month + "월 : 가을 입니다.";
				break;

			case 12: case 1: case 2:
				msg = month + "월 : 겨율 입니다.";
				break;

			default:
				month = 0;
				msg = "잘못된 입력입니다. 다시 입력해 주세요.";
				break;
			}

			System.out.println(msg);
		}

		sc.close();
		
	}

}
