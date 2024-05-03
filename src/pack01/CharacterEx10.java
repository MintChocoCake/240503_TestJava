package pack01;

public class CharacterEx10 {

	public static void main(String[] args) {
		
		char ch1 = '한';
		char ch2 = '\uD55C'; // [\ u를 붙어야 됨] 유니코드(2바이트 이상 사용)
		
		System.out.println(ch1);
		System.out.println(ch2);

	}

}
