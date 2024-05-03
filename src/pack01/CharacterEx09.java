package pack01;

public class CharacterEx09 {

	public static void main(String[] args) {
		// [java] char : 2바이트(16비트) -> 유니코드 
		// [C/C++/C#] char : 1바이트(8비트)
		char character = 'd';
		
		// java.lang.String : java.lang 은 java의 최상위 부모 클래스
		String str1 = "Hello Jaba";
		String str2 = "W";
		String str3 = "Welcom to Java";
		
		System.out.println("char : " + character);
		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);
		System.out.println("str3 : " + str3);
		
		System.out.println("====================");
		
	}

}
