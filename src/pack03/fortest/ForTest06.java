package pack03.fortest;

import java.util.Scanner;

public class ForTest06 {

	public static void main(String[] args) {
		// 10개의 정수를 입력받아 3의 배수, 5의 배수를 각각 출력
		
		Scanner sc = new Scanner(System.in);
		
		int[] inputAry = {};
		int count = 0;
		
		System.out.print("입력할 정수 개수 : ");
		count = sc.nextInt();
		inputAry = new int[count];
		
		int[] multipleThree = new int[(count/3)];
		int threeCount = 0;
		int[] multipleFive = new int[(count/5)];
		int fiveCount = 0;
		
		System.out.println("정수 " + count + " 개 입력.");
		for (int i = 0; i < count; i++) {
			System.out.print(i + " 번째 : ");
			inputAry[i] = sc.nextInt();
			
			if (0 == (inputAry[i] % 3)) {
				multipleThree[threeCount++] = inputAry[i];
			}
			if (0 == (inputAry[i] % 5)) {
				multipleFive[fiveCount++] = inputAry[i];
			}
		}
		
		int totalThreeM = 0;
		int totalFiveM = 0;
		
		System.out.println("[3배수] " + threeCount + " 개");
		for (int i = 0; i < threeCount; i++) {
			System.out.print(multipleThree[i] + " ");
			totalThreeM += multipleThree[i];
		}
		System.out.println();
		
		System.out.println("[5배수] "+ fiveCount + " 개");
		for (int i = 0; i < fiveCount; i++) {
			System.out.print(multipleFive[i] + " ");
			totalFiveM += multipleFive[i];
		}
		System.out.println();
		
		System.out.println("3배수 총합 : " + totalThreeM);
		System.out.println("5배수 총합 : " + totalFiveM);
		
		sc.close();
		
	}

}
