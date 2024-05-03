package packdemo.algorithm.chap01;

import java.util.Scanner;

public class Algorithm07 {

	public static void main(String[] args) {
		// 왼쪽 아래가 직각인 이등변 삼각형
		Scanner sc = new Scanner(System.in);
		System.out.print("몇단 : ");
		int num = Integer.parseInt(sc.nextLine());
		
		for (int i = 0; i < num; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");					
			}
			System.out.println();
		}

		sc.close();
		
	}

}
