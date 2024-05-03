package pack03.switchtest;

import java.util.Random;

public class SwitchCase05 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int num = ran.nextInt(10);;
		
		switch (num) {
		case 1: case 2: case 3: case 4: case 5: case 6:
			System.out.println(num + " 당첨");
			break;
		default:
			System.out.println(num + " 꽝");
			break;
		}
		
	}

}
