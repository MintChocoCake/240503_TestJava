package pack04;

import java.util.Scanner;

public class Example03 {

	public static void main(String[] args) {
		// 사용자에게 인덱스를 알고싶은 숫자를 1에서부터 10까지 입력 받아,
		// 해당 숫자의 인덱스를 찾아 출력하는 프로그램을 만드세요.
		// 단, 사용자가 입력한 값이 배열 인덱스로 나타낼 수 없는 경우 찾을 수 없다는 문구를 출력하세요.

		int[] numbers = { 10, 3, 2, 1, 4, 8, 7, 9, 5, 6 };
		int target;
		int index = -1;
		// 배열 내에서 찾지 못했을 경우 초기화.
		Scanner scan = new Scanner(System.in);
		
		boolean run = true;
		
		while (run) {
			index = -1;
			System.out.println("인덱스를 알고싶은 숫자를 1에서 10사이로 입력하세요. (종료 : 11)");
			target = scan.nextInt();
			
			for (int i = 0; i < numbers.length; i++) {
				if (target == numbers[i]) {
					index = i;
				}
			}
			
			if (11 == target) {
				System.out.println("종료.");
				break;
			} else if (-1 == index) {
				System.out.println(target + " 의 index 를 찾지 못했습니다.");
			} else {
				System.out.println(target + " 의 index : " + index);
			}
			
		}
		
		
		
	}

}
