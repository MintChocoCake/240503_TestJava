package pack05;

import javax.swing.JOptionPane;

public class FuncTest01 {

	/*접근제어자
	public : 해당 멤버가 어떤 클래스나 패키지에서 접근 가능
	protected : 해당 멤버가 같은 패키지 내의 클래스, 해당 클래스를 상속한 클래스에서 접근 가능
	default : 해당 멤버는 같은 패키지 안 클래스에에서만 접근 가능(접근 제어자 명시 안할때와 같음)
	private : 해당 멤버가 선언된 클래스 내에서만 접근 가능 
	*/
	
	public static int add(int _num1, int _num2) {
		return _num1 + _num2;
	}
	
	public static void main(String[] args) {
		
		int a = 0, b = 0;
		
		a = Integer.parseInt(JOptionPane.showInputDialog("a"));
		b = Integer.parseInt(JOptionPane.showInputDialog("b"));
		
		int sum = add(a, b);
		System.out.println(sum);
		
		System.out.println("=====[ex1]=====");
		Example01 ex1 = new Example01();
		int hap = ex1.sum(a, b);
		System.out.println(hap);
		
	}

}
