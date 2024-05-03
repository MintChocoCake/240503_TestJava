package pack01;

public class BinaryTest01 {

	public static void main(String[] args) {
		
		System.out.println("Hello Java");
		
		byte aVar = 10; // 1byte
		short bVar = 100; // 2byte
		int cVar = 1000; // 4byte
		long dVar = 10000; // 8byte
		
		System.out.println("byte : " + aVar);
		System.out.println("short : " + bVar);
		System.out.println("int : " + cVar);
		System.out.println("long : " + dVar);
		
		System.out.println("====================");
		
		short sVal = 10;
		byte bVal = 20;
		
		int result = 0;
		result = sVal + bVal;
		
		System.out.println("short : " + sVal);
		System.out.println("byte : " + bVal);
		System.out.println("result : " + result);
		System.out.println("(short+byte) : " + (sVal + bVal));
	}

}
