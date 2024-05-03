package pack02;

import java.util.Scanner;

public class _12_BitTest {

	public static void main(String[] args) {
		// 키보드 입력값 받기
		// 인스턴스 변수 (new) -> 동적할당
		// System.in : 입력을 받기위한 입력 스트림
		Scanner scan = new Scanner(System.in);
				
		System.out.print("1번째 숫자 입력 : ");
		int inputNum1 = scan.nextInt();
		
		System.out.print("2번째 숫자 입력 : ");
		int inputNum2 = scan.nextInt();
		
		int andResult = inputNum1 & inputNum2;
		int orResult = inputNum1 | inputNum2;
		int xorResult = inputNum1 ^ inputNum2;
		
		System.out.println("& 결과 : " + andResult);
		System.out.println("| 결과 : " + orResult);
		System.out.println("^ 결과 : " + xorResult);
		
		scan.close();
	}

}
