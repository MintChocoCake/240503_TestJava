package packdemo.demo;

public class Factorial_Demo {

	// 팩토리얼 알고리즘
	// 5! -> 5 x 4 x 3 x 2 x 1 
	// n! : n * (n-1) * (n-2) * (n-3) * (n-4)
	
	// #1 기본 팩토리얼
	public int factorial_1(int _num) {
		int num = _num;
		int result = 1;
		// 5 4 3 2 1
		for (int i = 0; i < _num; i++) {
			result *= (num - i);
		}
		return result;
	}
	
	// #2 재귀 팩토리얼
	public int factorial_2(int _num) {
		if (1 >= _num) {
			return _num;
		}
		
		// 1. (n=5) => f2(4) * 5 
		// 2. (n=4) => f2(3) * 4 
		// 3. (n=3) => f2(2) * 3 
		// 4. (n=2) => f2(1) * 2 
		// 5. (n=1) => if -> 1 
		return factorial_2(_num - 1) * _num; 
	}
	
	public static void main(String[] args) {
		
		Factorial_Demo fac = new Factorial_Demo();
		
		System.out.println("factoral_1(5) : " + fac.factorial_1(5));
		System.out.println("factoral_2(5) : " + fac.factorial_2(5));
		
		int result = 0;
		
		// 1 2 3 4 5
		for (int i = 1; i < 6; i++) {
			result = fac.factorial_2(i);
			System.out.println(i + "! = " + result);
		}
		
	}

}
