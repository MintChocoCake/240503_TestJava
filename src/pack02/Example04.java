package pack02;

import java.util.Scanner;

public class Example04 {

	final double pi = 3.14;
	public double calculateCircleArea(int _radius) {
		double result = (double)_radius * _radius * this.pi;
		
		return result;
	}
	
	public static void main(String[] args) {
		// 원의 넓이 (반지름 * 반지름 * 3.14)
		// 반지름 10 , 3.14 는 double 로 정의 
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("반지름 입력 : ");
			int radius = sc.nextInt();
			
			Example04 example = new Example04();
			
			System.out.println("원의 넓이 : " + example.calculateCircleArea(radius));
		}
		
		System.out.println("====================");
		
		int num1 = 10;
		int num2 = 3;
		int num3 = 14;
		
		// Double, Integer 등 : 기본자료형을 객체로 다루기 위한 래퍼클래스
		Double.parseDouble("String"); // String => double 변환
		Integer.parseInt("String"); // String => int 변환
		
		double result = num1 * num1 * Double.parseDouble(num2 + "." + num3);
		System.out.println("원의 넓이 : " + result);		

	}

}
