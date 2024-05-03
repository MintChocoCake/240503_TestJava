package pack02;

public class _03_Incre_Test {

	public static void main(String[] args) {

		int a, b, c = 0;
		a = 10; b = 20; c = 3;
		
		System.out.println("++a : " + (++a));
		System.out.println("a++ : " + (a++));
		System.out.println("후위연산 : " + a);
		
		System.out.println("====================");
		
		System.out.println("++a + b++ : " + (++a + b++));
		System.out.println("후위연산 : " + b);
		
		System.out.println("====================");
		
		System.out.println("++a : " + (++a));
		System.out.println("b++ : " + (b++));
		System.out.println("후위연산 : " + b);
		System.out.println("++a + b++ : " + (++a + b++));
		System.out.println("후위연산 : " + b);
		
	}

}
