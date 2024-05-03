package pack03.fortest;

import java.util.Scanner;

public class ForTest02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 입력 : ");
		int num = sc.nextInt();
		
		int i = 0;
		int sum = 0;
		
		for (i = 0;; i++) {
			if (sum > num) {
				break;
			}
			
			sum += i;
		}
		
		System.out.println(i + " 번째까지 총합 : " + sum);
		
		sc.close();
		
	}

}
