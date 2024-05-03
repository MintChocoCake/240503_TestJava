package packdemo.algorithm.chap02;

import java.util.Scanner;

public class Algorithm06 {

	// 소수 판독
	public static boolean isDecimal(int _num) {
		int count = 0;
		int result = 0;
		
		for (int i = 2; i < _num; i++) {
			result = _num % i; 
			count ++;
			//System.out.println("[" + i + "] Count : " + count + " Result : " + result);
			if (0 == result) {
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		// 2 ~ 1000 모든 소수 열거
		
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int max = 0;
		
		int[] decimalArr = null;
		int index = 0;
		
		while (1 > num && 2 > max) {
			System.out.print("소수를 검사할 정수 입력 : ");
			num = Integer.parseInt(sc.nextLine());
			
			System.out.print("소수를 검사할 최대범위 (3 이상) : ");
			max = Integer.parseInt(sc.nextLine());
		}
		
		System.out.println(num + " 은 소수인가요 ? : " + isDecimal(num));
		
		System.out.println("===============");
		
		decimalArr = new int[max];
		
		// 짝수면 소수가 x -> 홀수만 검사.
		for (int i = 3; i < max; i += 2) {
			if (isDecimal(i)) {
				decimalArr[index++] = i;
			}
		}
		
		for (int i = 0; i < index; i++) {
			System.out.println(decimalArr[i]);
		}
		
		sc.close();
		
	}

}
