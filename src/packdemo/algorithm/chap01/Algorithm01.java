package packdemo.algorithm.chap01;

import java.util.Scanner;

public class Algorithm01 {
	
	public static int max(int _num1, int _num2) {
		return (_num1 > _num2) ? _num1 : _num2;
	}
	
	public static void main(String[] args) {
		// 세 정수의 최대값
		// a = 1 , b = 3 , c = 2 
		// 최대값 3
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("a : ");
		int a = Integer.parseInt(sc.nextLine());
		System.out.print("b : ");
		int b = Integer.parseInt(sc.nextLine());
		System.out.print("c : ");
		int c = Integer.parseInt(sc.nextLine());
		
		int result1 = max(max(a, b),c);
		
		int max = (a > b) ? a : b  ;
		max = (max > c) ? max : c;
		
		System.out.println("result1 : " + result1);
		System.out.println("max : " + max);
		
		sc.close();
	}

}
