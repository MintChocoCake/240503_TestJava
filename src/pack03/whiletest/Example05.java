package pack03.whiletest;

import java.util.Random;
import java.util.Scanner;

public class Example05 {

	public static void main(String[] args) {
		/* 숫자 맞추기 게임
		1부터 100까지 무작위 숫자를 선택하고, 숫자를 맞추는 게임
		만약 입력한 숫자가 컴퓨터가 선택한 숫자보다 크면 "더 작은 숫자를 추측하세요" 출력
		만약 입력한 숫자가 컴퓨터가 선택한 숫자보다 작으면 "더 큰 숫자를 추측하세요" 출력
		선택한 숫자를 정확히 맞출 때까지 과정을 반복
		맞출때까지 걸린 시도 횟수를 출력하여 축하의 메시지를 출력 */
		
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		int targetNum = rand.nextInt(100) + 1; 
		int quess = 0;
		int count = 0;
		int life = 0;
		
		while (0 >= life) {
			System.out.print("목숨 설정 : ");
			life = sc.nextInt();
			
			if (0 < life)
				break;
			
			System.out.println("다시 입력하세요.");
		}

		do {
			System.out.println("[도전 횟수 : " + count + "] " + "[남은 목숨 : " + life + "] " + "(종료 : -1)");
			System.out.print("숫자 입력 : ");
			quess = sc.nextInt();
			
			if (-1 == quess)
				break;
			
			count++;
			
			if (quess < targetNum) {
				System.out.println("더 커야 합니다.");
			} 
			else if (quess > targetNum) {
				System.out.println("더 작아야 합니다.");
			} 
			else {
				System.out.println("정답입니다.");
				break;
			}
			
			life--;
		} while (0 != life);
		
		System.out.println("========[결과]========");
		System.out.println("[정답 : " + targetNum + "] " + 
		"[총 도전 횟수 : " + count + "] " + "[남은 목숨 : " + life + "]");
		
	}

}
