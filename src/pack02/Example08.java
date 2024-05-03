package pack02;

import java.util.Scanner;




public class Example08 {

	public static int BiggerCheck(int _num1, int _num2) {
		return (_num1 > _num2) ? _num1 : _num2;
	}
	public static int SmallerCheck(int _num1, int _num2) {
		return (_num1 < _num2) ? _num1 : _num2;
	}
	
	public static void PrintBiggerSmaller(int _num1, int _num2) {
		if (_num1 == _num2) {
			System.out.println(_num1 + " 과 " + _num2 + " 같습니다.");
			return;
		}
		
		System.out.println(((_num1 > _num2) ? _num1 : _num2) + " 이 " +
				((_num1 < _num2) ? _num1 : _num2) + " 보다 더 큽니다.");
	}
	
	public static void main(String[] args) {
		// 두개의 숫자를 입력받아 첫번째 숫자가 두번째 숫자보다 큰지 여부 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("num1 : ");
		int num1 = sc.nextInt();
		System.out.print("num2 : ");
		int num2 = sc.nextInt();
		
		sc.close();
		
		if (num1 == num2) {
			System.out.println(num1 + " 과 " + num2 + " 같습니다.");
		}
		else {
			System.out.println(((num1 > num2) ? num1 : num2) + " 이 " +
					((num1 < num2) ? num1 : num2) + " 보다 더 큽니다.");
		}
		
		//PrintBiggerSmaller(num1, num2);
		
	}

}
