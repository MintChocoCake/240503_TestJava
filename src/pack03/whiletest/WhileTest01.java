package pack03.whiletest;

public class WhileTest01 {

	public static void main(String[] args) {
		
		int num = 0;
		while (true) {
			num = (int)(Math.random() * 6) + 1;
			System.out.println("주사위 : " + num);
			
			if (6 == num) {
				break;
			}
		}

	}

}
