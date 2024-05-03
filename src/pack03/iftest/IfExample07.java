package pack03.iftest;

import java.util.Scanner;

public class IfExample07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 래퍼 클래스 (Double, Integer 등) : 기본 자료형을 객체로 다루기 위해 사용하는 클래스
		System.out.println("첫번째 수 : ");
		double num1 = Double.parseDouble(sc.nextLine());;
		System.out.println(num1);
		
		System.out.println("두번째 수 : ");
		double num2 = Double.parseDouble(sc.nextLine());;
		System.out.println(num2);
		
		sc.close();
		
	}

}
