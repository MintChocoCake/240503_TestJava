package pack03.switchtest;

import java.util.Scanner;

public class SwitchCase03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int month = 0;
		int day = 0;
		
		System.out.print("월 입력 : ");
		month = sc.nextInt();
		
		switch (month) {
		case 1: case 3: case 5: case 7:
			case 8: case 10: case 12:      
			day = 31;
			break;
		case 2: 
			day = 29;
			break;
		case 4: case 6: case 9: case 11: 
			day = 30;
			break;
		default:
			day = 0;
			System.out.println("Month Error");
			break;
		}
		
		System.out.println(month + " 월은 " + day + " 일 까지 있습니다.");
		
		sc.close();
		
	}

}
