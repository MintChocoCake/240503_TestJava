package packdemo.algorithm.chap01;

import java.util.Scanner;

public class Algorithm05 {

	public static void main(String[] args) {
		// 2자리수 정수만 입력
		
		Scanner sc = new Scanner(System.in);
		int num = 0;
		
		while (true) {
			System.out.print("2자리수 정수 입력 : ");
			num = Integer.parseInt(sc.nextLine());
			
			if (9 < num && 100 > num) {
				break;
			}
		}
		
		System.out.println("num : " + num);
		sc.close();
	}

}
