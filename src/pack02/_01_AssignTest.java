package pack02;

public class _01_AssignTest {

	public static void main(String[] args) {
		// 대입연산
		int num1 = 10;
		int num2 = 20;

		num1 += num2;
		System.out.println(num1);
		
		System.out.println("====================");
		
		int num3 = 20;
		System.out.println("num3 += 10" + (num3 += 10));
		System.out.println("num3 -= 10" + (num3 -= 10));
		System.out.println("num3 *= 10" + (num3 *= 10));
		System.out.println("num3 /= 10" + (num3 /= 10));
		System.out.println("num3 %= 10" + (num3 %= 10));
		
		System.out.println("====================");
		// 음수표시 & 음수변환
		int num4 = 10;
		int num5 = 20;
		
		System.out.println(+num4);
		System.out.println(-num4);
		
		num5 = -num4;
		
		System.out.println(+num5);
		System.out.println(-num5);
		
		
	}

}
