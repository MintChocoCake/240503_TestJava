package pack02;

public class _07_LogicTest {

	public static void main(String[] args) {
		// 논리 연산자
		char a = 'A', b = 'B';
		boolean c = true;
		
		c = (true || true) && false;
		System.out.println(c);
		
		System.out.println("==========");
		
		c = (a < b) && (a == b);
		System.out.println(c);
		
		c = (a < b) || (a == b);
		System.out.println(c);
		
	}

}
