package pack03.whiletest;

import java.util.Scanner;

public class Example06 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		int cnt = 0, num = 0;
		boolean run = true;
		String str = ""; //빈 문자열로 초기화
		Scanner scan = new Scanner(System.in);
		
		while (run) {
			System.out.println("------------------------------------------");
			System.out.println("1. 빵 개수만 선택 | 2. 빵 개수와 종류 선택 | 3. 종료");
			System.out.println("------------------------------------------");
			System.out.print("선택 : ");
			num = Integer.parseInt(scan.nextLine());
			
			switch (num) {
			case 1:
				System.out.print("빵 개수 : ");
				cnt = Integer.parseInt(scan.nextLine());
				if (0 >= cnt) 
					System.out.println("잘못된 입력.");
				
				for (int i = 0; i < cnt; i++) {
					System.out.println(str + "빵 " + (i + 1) + " 개");
				}
				
				System.out.println("빵 " + cnt + " 개가 완성 되었습니다.");
				break;
				
			case 2:
				System.out.print("빵 개수 : ");
				cnt = Integer.parseInt(scan.nextLine());
				
				System.out.print("빵 종류 : ");
				str = scan.nextLine();
				if (0 >= cnt) 
					System.out.println("잘못된 입력.");
				
				for (int i = 0; i < cnt; i++) {
					System.out.println(str + " 빵 " + (i + 1) + " 개");
				}
				
				System.out.println("요청하신 " + str + "빵 " + cnt + "개가 완성 되었습니다.");
				break;
				
			case 3:
				run = false;
				System.out.println("프로그램 종료.");
				break;
				
			default:
				System.out.println("잘못된 입력입니다.");
				break;
			} // switch
			
		} // while
		
		scan.close();
	} // main

}
