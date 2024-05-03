package pack02;

import java.util.Scanner;

public class Example05 {

	String numResult = "";
	
	public void PositiveNegative(int _num) {
		numResult = (0 < _num) ? "양수" : (0 > _num)? "음수" : "0" ; 
		System.out.println(numResult + " 입니다.");
	}
	public void OddEven(int _num) {
		int result = _num % 2;
		
		numResult = (0 == _num)? "0" : (0 == result) ? "짝수" : "홀수";
		System.out.println(numResult + " 입니다.");
	}
	
	public static void main(String[] args) {
		// 변수가 양수/음수 여부를 판별하는 프로그램 -> 3항연산자 사용
		
		try(Scanner sc = new Scanner(System.in)) {
			
			Example05 example = new Example05();
			
			System.out.print("숫자 입력 : ");
			int inputNum = sc.nextInt();
			example.PositiveNegative(inputNum);
			example.OddEven(inputNum);
		}
		
	}

}
