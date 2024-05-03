package pack02;

import java.util.Scanner;

public class Example07 {

	String resultMsg = "";
	Scanner sc = new Scanner(System.in);
	int inputNum = 0;
	int resultNum = 0;
	
	public void OddEven() {
		System.out.print("정수 입력 : ");
		inputNum = sc.nextInt();
			
		resultNum = inputNum % 2;
		
		resultMsg = (0 == inputNum) ? "0" : (0 == resultNum) ? "짝수" : "홀수";
		
		System.out.println(resultMsg + " 입니다.");
		Free();
	}
		
	public void OddEven(Scanner _sc) {
		System.out.print("정수 입력 : ");
		inputNum = _sc.nextInt();
			
		resultNum = inputNum % 2;
		
		resultMsg = (0 == inputNum) ? "0" : (0 == resultNum) ? "짝수" : "홀수";
		
		System.out.println(resultMsg + " 입니다.");
	}
	
	public void Free() {
		sc.close();
	}
	
	public static void main(String[] args) {
		// 한 자리수 숫자를 입력받아 짝수인지 홀수인지 출력
		Example07 example = new Example07();
		
		//example.OddEven();
		
		try(Scanner sc = new Scanner(System.in)) {
			example.OddEven(sc);
		}
		
	}

}
