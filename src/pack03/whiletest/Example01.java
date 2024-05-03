package pack03.whiletest;

import java.util.Scanner;

public class Example01 {

	public static void main(String[] args) {
		// 사용자가 "no" 입력 전까지 계속해서 메시지를 입력받고, 출력 (do - while)
		
		Scanner sc = new Scanner(System.in);
		
		String Inputmsg = "";
		
		do {
			System.out.println("메시지 입력 [종료 : no]");
			Inputmsg = sc.next();
			
			System.out.println("메시지 : " + Inputmsg);
			
		} while (!Inputmsg.equals("no"));
		
		System.out.println("프로그램 종료");
		sc.close();
		
	}

}
