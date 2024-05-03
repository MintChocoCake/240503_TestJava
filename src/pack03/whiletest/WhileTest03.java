package pack03.whiletest;

import java.util.Scanner;

public class WhileTest03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int score = 0;
		String msg = "";
		
		while (true) {
			System.out.print("점수 입력 : ");
			score = sc.nextInt();
			
			if (0 > score || 100 < score) {
				msg = "잘못된 입력입니다.";
				System.out.println(msg);
				break;
			}
			else if (60 <= score) {
				msg = score + " 점 합격입니다.";
			}
			else {
				msg = score + " 점 불합격입니다.";	
			} 
			
			System.out.println(msg);
		}
		
		sc.close();

	}

}
