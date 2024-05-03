package pack05;

public class MethodTest03 {
	
	public static int add(int _num1, int _num2) {
		return _num1 + _num2;
	}
	public static double add(double _num1, double _num2) {
		return _num1 + _num2;
	}
	
	public static void main(String[] args) {
		
		int sum = add(5, 10);
		double sumDouble = add(3.5, 7.2);
		
		System.out.println("합계(int) : " + sum);
		System.out.println("합계(double) : " + sumDouble);

	}

}
