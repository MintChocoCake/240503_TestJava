package pack01;

public class CharacterEx11 {

	public static void main(String[] args) {
		// 아스키 코드 A : 65 / a : 97
	
		// 명시적 형변환 (int -> char)
		int a1 = 65;
		System.out.println("(char)65 : " + (char)a1); // 아스키 코드를 문자로
		char a2 = 'A';
		System.out.println("(int)A : " + (int)a2);
	
		int b1 = 97;
		System.out.println("(char)97 : " + (char)b1);
		char b2 = 'a';
		System.out.println("(int)a : " + (int)b2);
		
		// 107 : k
		System.out.println("(char)97 + 10 : " + (char)(b1 + 10));
		System.out.println("(int)a + 10 : " + (int)(b2+10));
		
		System.out.println("====================");
		
		
		
	}

}
