package pack02;

public class _13_Condition {

	public static void main(String[] args) {
		// 삼항 연산
		int a = 10;
		int b = 15;
		boolean result = true;
		
		result = (a >= b) ? true : false;
		
		System.out.println(result);
		
		int n1 = 10;
		int n2 = 20;
		char result2;
		
		result2 = (++n1 == n2) ? 'Y' : 'N';
		System.out.println(result2);
		
		System.out.println("====================");
		
		int fatherAge = 38;
		int motherAge = 45;
		
		String str = (fatherAge > motherAge) ? "연상" : "연하" ;
		System.out.println(str);
		
	}

}
