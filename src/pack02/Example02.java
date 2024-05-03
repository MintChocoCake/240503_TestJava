package pack02;

import java.util.Scanner;


public class Example02 {

	public static void main(String[] args) {
		
		/* soldesk 과수원
		 * 배, 사과, 오렌지를 키우고 있는데 하루에 생산되는 양은 각각 5개, 7개, 5개 입니다.
		 * 과수원에서 하루에 생산되는 총 과일의 갯수를 출력하고,
		 * 시간당(24) 전체 과일의 평균 생산 갯수를 출력 하시오.
		 * (단, 평균값을 담는 데이터 타입은 float)로 정의한다.
		 */
		
		// 배, 사과, 오랜지
		int pear = 5, apple = 7, orange = 5;		

		int Total = (pear + apple + orange);
		float Ave = Total / 24.0f;
		
		System.out.println("하루 생산량 : " + Total);
		System.out.println("시간당 평균 : " + Ave);
		
		
		System.out.println("===============");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("오늘자 배 생산량 : ");
		int pears = scan.nextInt();
		System.out.print("오늘자 사과 생산량 : ");
		int apples = scan.nextInt();
		System.out.print("오늘자 오랜지 생산량 : ");
		int oranges = scan.nextInt();
		
		System.out.println("=====[통계[=====");
		int fruitTotal = (pears + apples + oranges);
		float fruitHourAve = fruitTotal / 24.0f;
		
		System.out.println("하루 생산량 : " + fruitTotal);
		System.out.println("시간당 평균 : " + fruitHourAve);
		
		scan.close();
	}

}
