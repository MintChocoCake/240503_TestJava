package pack02;

public class _08_LogicTest {

	public static void main(String[] args) {
		
		int num1 = 10;
		int i = 2;
		boolean value = true;
		
		value = ((i+=2) < 10) && ((num1+=2) < 10);
		System.out.println(i);
		System.out.println(num1);
		System.out.println(value);
		
		System.out.println("====================");
		
		// 앞 조건이 true 여서 무조건 true -> 뒷항의 연산 실행 x
		value = ((i+=2) < 10) || ((num1+=2) < 10);
		System.out.println(i);
		System.out.println(num1);
		System.out.println(value);
		
	}

}
