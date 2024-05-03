package pack03.fortest;

public class ForTest04 {

	public static void main(String[] args) {
		
		int i = 0;
		char alpa = 'A'; // 65
		
		for (i = alpa; i < 'Z'; i++) {
			System.out.println("int : " + i + "  char : " + (char)i + "  alpa : " + alpa++);
		}

	}

}
