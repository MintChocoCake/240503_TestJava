package pack05;

public class Example01 {

	public int sum(int _num1, int _num2) {
		return _num1 + _num2;
	}
	
	public static void main(String[] args) {
		
		Example01 ex1 = new Example01();
		
		int num1 = 10;
		int num2 = 20;
		
		System.out.println(ex1.sum(num1, num2));

	}

}
