package pack03.whiletest;

import java.util.Scanner;

public class WhileTest04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = 0, cnt = 0, sum = 0;
		double avg = 0.0;
		
		while (true) {
			System.out.print("숫자 입력 (0 - 종료) : ");
			num = sc.nextInt();
			
			if (0 == num) {
				break;
			}
			
			cnt++;
			sum += num;
		}
		
		avg = (double)sum / cnt;
		
		System.out.println("입력 수 : " + cnt);
		System.out.println("총합 : " + sum);
		System.out.println("평균 : " + avg + " 반올림 : " + Math.round(avg));
		
		sc.close();

	}

}
