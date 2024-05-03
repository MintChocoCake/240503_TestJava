package pack02;

public class _10_BitTest {

	public static void main(String[] args) {
		
		int num1 = 5; // 0101
		int num2 = 10; // 1010
		
		// Bit OR(|) : 하나라도 1이면 1로 반환
		int result = num1 | num2;
		System.out.println(result);
		
		// Bit  AND(&) : 모두 1이어야 1로 반환
		result = num1 & num2;
		System.out.println(result);
		
		// Bit  XOR(^) : 0과 1이면 1로 반환
		result = num1 ^ num2;
		System.out.println(result);
		
		// Bit  비트전환(~) : 0은 1로, 1은 0으로
		result = ~num1;
		int result2 = ~num2;
		System.out.println(result + " " + result2);
		
	}

}
