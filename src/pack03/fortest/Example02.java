package pack03.fortest;

public class Example02 {

	public static void main(String[] args) {
		// 홀수 구구단
		
		for (int i = 1; i < 10; i += 2) {
			System.out.println("[" + i + " 단]");
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " * " + j + " = " + (i * j));
			}
		}
		
	}

}
