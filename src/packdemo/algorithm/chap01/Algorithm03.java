package packdemo.algorithm.chap01;

import java.util.Scanner;

public class Algorithm03 {

	public static void main(String[] args) {
		// 1 부터 n 까지의 합
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		int num = Integer.parseInt(sc.nextLine());
		int result = 0;
		
		for (int i = 0; i < num; i++) {
			result += i;
		}
		
		System.out.println("1 부터 " + num + " 까지 합 : " + result);
		
		sc.close();
	}

}
