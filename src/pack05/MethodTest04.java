package pack05;

public class MethodTest04 {

	public static int add(int _num1, int _num2) {
		return (_num1 + _num2);
	}
	public static int subtract(int _num1, int _num2) {
		return (_num1 - _num2);
	}
	public static int multiply(int _num1, int _num2) {
		return (_num1 * _num2);
	}
	public static double divide(int _num1, int _num2) {
		return ((double)_num1 / _num2);
	}
	public static double divide(double _num1, double _num2) {
		return (_num1 / _num2);
	}
	
	public static void main(String[] args) {
		// +
		System.out.println(add(5, 3));
		// -
		System.out.println(subtract(10, 4));
		// * 
		System.out.println(multiply(6, 7));
		// /
		System.out.println(divide(20.4, 4.0));

	}

}
