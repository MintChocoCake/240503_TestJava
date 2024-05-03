package pack03.switchtest;

import java.util.Random;
import java.util.Scanner;

public class Example02 {

	public static void main(String[] args) {
		// 요일을 입력받아 (1~7) 해당 요일에 어떤 음식을 먹을지 출력
		
		Scanner sc = new Scanner(System.in);
		String day = "";
		String msg = "";
		String[] food = { "초밥", "국밥", "돈까스", "텐동", "소바", "치킨", "금식" };
		int foodIndex = 0;
		
		Random ran = new Random();
		
		while ("" == day) {
			System.out.print("요일 입력 [월~금] : ");
			day = sc.next();
			
			switch (day) {
			case "월": 
			case "화": 
				foodIndex = ran.nextInt(6);
				break;
			case "수": 
			case "목": 
				foodIndex = 2 + ran.nextInt(4);
				break;
			case "금":
			case "토": 
			case "일": 
				foodIndex = ran.nextInt(5);
				break;
			default:
				msg = "다시 입력하세요";
				day = "";
				break;
			}
			
			if ("" != day) {
				msg = foodIndex + ". [" + day + "] 추천메뉴 : " + food[foodIndex];
			}
			System.out.println(msg);
			
		}

		sc.close();
		
	}

}
