package pack02;

import java.util.Scanner;

public class Example03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// #1 삼항연산자 이용 score1이 60보다 크거나 같으면 합격 아니면 불합 반환
		System.out.print("Score1 : ");
		int score1 = sc.nextInt();
		boolean result1 = (60 <= score1) ? true : false;
		System.out.println("result1 : " + result1);
		
		System.out.println("====================");
		
		// #2 삼항연산자 이용 score2가 90보다 크면 A, 80보다 크면 B, 그 이하 C
		System.out.print("Score2 : ");
		int score2 = sc.nextInt();
		
		System.out.print("cutLine1 : ");
		int cutLine1 = sc.nextInt();
		System.out.print("cutLine2 : ");
		int cutLine2 = sc.nextInt();
		
		while (cutLine1 < cutLine2) {
			System.out.println("cutLine1 이 cutLine2 보다 높아야 합니다.");
			System.out.print("cutLine2 : ");
			cutLine2 = sc.nextInt();
		}
		
		char result2 = (cutLine1 < score2) ? 'A' : (cutLine2 < score2) ? 'B' : 'C';
		
		System.out.println(cutLine1 + " [A] , " + cutLine2 + " [B] , " + "remain" +" [C] ");
		System.out.println("result : \'" + result2 + "\'" );
		
		sc.close();
	}

}
