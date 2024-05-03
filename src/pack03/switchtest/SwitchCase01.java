package pack03.switchtest;

import java.util.Scanner;

public class SwitchCase01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("등수 입력 : ");
		int ranking = sc.nextInt();
		
		String medalColor = "";
		
		switch (ranking) {
		case 1: 
			medalColor = "Gold";
			break;
		case 2: 
			medalColor = "Silver";
			break;
		case 3: 
			medalColor = "Bronze";
			break;
		default:
			medalColor = "None";
			break;
		}
		
		System.out.println(ranking + " 등 메달 : " + medalColor);

		sc.close();
		
	}

}
