package pack03.switchtest;

import java.util.Scanner;

public class SwitchCase04 {

	public static void main(String[] args) {
		// Scanner 클래스의 인스턴스 변수 scan에 값을 입력받음
		// A, a -> 최우수고객, B, b -> 우수고객, 나머지 -> 일반고객
		// charAt(0) : String -> char

		Scanner sc = new Scanner(System.in);
		String rank = "";
		
		System.out.print("등급은 ? : ");
		char grade = sc.nextLine().charAt(0);
		
		switch (grade) {
		case 'A': case 'a': 
			rank = "최우수 고객";
			break;
		case 'B': case 'b': 
			rank = "우수 고객";
			break;
		default:
			rank = "일반 고객";
			break;
		}
		System.out.println(grade + " 등급 : " + rank + " 입니다.");
		
		sc.close();
		
	}

}
