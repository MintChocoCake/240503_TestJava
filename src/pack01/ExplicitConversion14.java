package pack01;

public class ExplicitConversion14 {

	public static void main(String[] args) {
		
		int iNum = 1000;
		byte bNum = (byte)iNum; // -128 ~ 127 (2n ~ 2n-1)
		
		System.out.println(iNum);
		System.out.println(bNum); // 1000 -> -24 : 유실된 결과값(손실)
		
		String bString = Integer.toBinaryString(iNum);
		System.out.println(bString);
		
		System.out.println("====================");
		
		double dNum1 = 1.2;
		float fNum1 = 0.9f;
		
		int iNum1 = (int)(dNum1 + fNum1); // 1.2 + 0.9 = 2.1 -> 2
		int iNum2 = (int)dNum1 + (int)fNum1; // 1 + 0 = 2
		
		System.out.println(iNum1);
		System.out.println(iNum2);
		
	}

}
