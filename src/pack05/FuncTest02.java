package pack05;

public class FuncTest02 {
	
	public static void swap(int _x, int _y) {
		int temp = _x;
		_x = _y;
		_y = temp;
		System.out.println("swap() : a - " + _x + ", b - " + _y);
	}
 	
	public static void main(String[] args) {
		
		//int a = 10, b = 20;
		Integer a = new Integer(10);
		Integer b = new Integer(10);
		
		
		System.out.println("swap() 호출 전 : a - " + a + ", b - " + b);
		System.out.println("===============");
		swap(a, b);
		System.out.println("===============");
		System.out.println("swap() 호출 후 : a - " + a + ", b - " + b);
	}

}
