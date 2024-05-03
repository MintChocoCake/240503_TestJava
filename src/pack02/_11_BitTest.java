package pack02;

public class _11_BitTest {

	public static void main(String[] args) {
		
		int num = 0B00000101; // 5
		
		// 0000 0101
		System.out.println(num);
		
		// 0001 0100  [ m << n  : m x 2의 n승 ]
		System.out.println(num << 2); // 5 * 4 = 20
		
		// 0000 0001 [ m << n : m / 2의 n승 ]
		System.out.println(num >> 2); // 5 / 4 = 1
		
		System.out.println("==========");
		
		int a = 5;
		int b = 2;
		
		int c = a>>b;
		System.out.println(c); // 5 / 4 = 1
		
		c = a<<b;
		System.out.println(c); // 5 * 4 = 20
		
	}

}
