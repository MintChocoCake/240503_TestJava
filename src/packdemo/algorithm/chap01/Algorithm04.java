package packdemo.algorithm.chap01;

import java.util.Scanner;

public class Algorithm04 {

	public static void main(String[] args) {
		// 1 부터 n 까지의 합 (양수 일때만)
		
		Scanner sc = new Scanner(System.in);
		int num = 0;
		
		while (true) {
			System.out.print("양수만 입력 : ");
			num = Integer.parseInt(sc.nextLine());
			
			if (0 < num)
				break;
		}
		
		int result = 0;
		
		for (int i = 0; i <= num; i++) {
			result += i;
		}
		
		System.out.println("1부터 "+ num + "까지 합 : " + result);
		
		sc.close();
	}

}
