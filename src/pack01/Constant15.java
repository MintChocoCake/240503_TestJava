package pack01;


public class Constant15 {
	
	public static int add(int a, int b) {
		return a + b;
	}
	public static int add(int a) {
		return a + a;
	}
	
		public static void main(String[] args) {
			
			// final (상수) : 변하지 않는 값
			final int MAX_NUM = 100;
			final int MIN_NUM; // 선언 만
			final double PI = 3.14;

			MIN_NUM = 3; // 선언만 했기에 대입이 한번 가능
			// MIN_NUM = 6; -> 두번째에는 에러
			
			int a = 10;
			int b = 20;
			int result = 0;
			
			result = add(a,b);
			System.out.println("add1 : " + result);
			result = add(a);
			System.out.println("add2 : " + result);
			result = add(b);
			System.out.println("add3 : " + result);
			
		}
}
