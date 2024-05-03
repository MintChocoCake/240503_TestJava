package packdemo.algorithm.chap01;

import java.util.Scanner;

public class Algorithm02 {

	public static void main(String[] args) {
		// 입력한 정수가 양수/음수/0 인지 판단
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 : ");
		int num = Integer.parseInt(sc.nextLine());
		
		if (0 == num) {
			System.out.println("0 입니다.");
		} else if (0 < num) {
			System.out.println("양수 입니다.");
		} else if (0 > num) {
			System.out.println("음수 입니다.");
		}
		
		sc.close();
	}

}
