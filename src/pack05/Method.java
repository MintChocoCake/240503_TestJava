package pack05;

import java.util.Scanner;

public class Method {
	
	Scanner sc = new Scanner(System.in);
	
	public static void printHello() {
		System.out.println("Hello World!");
	}
	
	public void makeBread() {
		System.out.println("빵을 만듭니다.");
	}
	public void makeBread(int _count) {
		for (int i = 0; i < _count; i++) {
			System.out.println("빵을 " + (i + 1) + " 개 만듭니다.");
		}
		System.out.println("요청하신 " + _count + " 개의 빵을 모두 만들었습니다.");
	}
	public void makeBread(String _name,  int _count) {
		for (int i = 0; i < _count; i++) {
			System.out.println(_name + "빵을 " + (i + 1) + " 개 만듭니다.");
		}
		System.out.println("요청하신 " + _count + " 개의 " + _name + "빵을 모두 만들었습니다.");
	}
	
	public void order() {
		int cnt = 0, num = 0;
		boolean run = true;
		String str = ""; //빈 문자열로 초기화
		
		while (run) {
			System.out.println("------------------------------------------");
			System.out.println("1. 빵 개수만 선택 | 2. 빵 개수와 종류 선택 | 3. 종료");
			System.out.println("------------------------------------------");
			System.out.print("선택 : ");
			num = Integer.parseInt(sc.nextLine());
			// next() : 공백 허용 안함
			// nextLine() : 공백 허용 (스페이스바 전까지 읽어들임)
			
			switch (num) {
			case 1:
				System.out.print("빵 개수 : ");
				cnt = Integer.parseInt(sc.nextLine());
				if (0 >= cnt) 
					System.out.println("잘못된 입력.");
				
				makeBread(cnt);
				break;
				
			case 2:
				System.out.print("빵 개수 : ");
				cnt = Integer.parseInt(sc.nextLine());
				
				System.out.print("빵 종류 : ");
				str = sc.nextLine();
				if (0 >= cnt) 
					System.out.println("잘못된 입력.");
				
				makeBread(str, cnt);
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
	} // order
	
} // class
