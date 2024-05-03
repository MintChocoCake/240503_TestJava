package pack01;

public class BinaryTest03 {

	public static void main(String[] args) {
		
		// 0 -> 양수 , 1 -> 음수
		// 맨앞 0B 제외 16 자리.
		int num1 = 0B00000000000000000000000000000101; // 5
		int num2 = 0B11111111111111111111111111111010; // 1의 보수 [0->1, 1->0] -6
		int num3 = 0B11111111111111111111111111111011; // 2의 보수 [1의 보수 + 1] -5

		System.out.println("num1 : " + num1);
		System.out.println("num1의 1의 보수 : " + num2);
		System.out.println("num1의 2의 보수 : " + num3);
		System.out.println("num1 + num3 : " + (num1 + num3));
		// 원본값 + 2의 보수를 더하면 0 이 나온다. (보수의 개념)
		
		System.out.println("====================");

		System.out.println(Integer.toBinaryString(-6));
		
	}

}
