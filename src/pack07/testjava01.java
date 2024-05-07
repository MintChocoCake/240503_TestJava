package pack07;

public class testjava01 {
	
	public int add(int a, int b) {
		return (a + b);
	}
	
	public static void main(String[] args) {
		testjava01 ts = new testjava01();
		
		System.out.println(ts.add(1,2));
		System.out.println(ts.add(3,4));
		System.out.println(ts.add(5,6));
	}

}
