package pack01;

public class LongVariable05 {

	public static void main(String[] args) {
		// Long
		// int numI = 12345678900; -> int = 32비트 (x)

		long numL1 = 12345678900L; // long -> 64비트 
		long numL2 = 1000; // 64비트 지만 L이 선언되지 않아 int로 인식해 자동 형 변환
	
		System.out.println("numL1 크기 : " + numL1);
		System.out.println("numL2 크기 : " + numL2);
		
		// 더 큰 범위인 long 으로 자동형변환
		System.out.println("numL1 + numL2 : " + (numL1 + numL2)); 

		
		System.out.println("====================");
		
		System.out.printf("byte형의 크기 : %d\n", Byte.SIZE);
		System.out.printf("short형의 크기 : %d\n", Short.SIZE);
		System.out.printf("int형의 크기 : %d\n", Integer.SIZE);
		System.out.printf("long형의 크기 : %d\n", Long.SIZE);
		System.out.printf("float형의 크기 : %d\n", Float.SIZE);
		System.out.printf("double형의 크기 : %d\n", Double.SIZE);
		System.out.printf("char형의 크기 : %d\n", Character.SIZE);
		
	}

}
