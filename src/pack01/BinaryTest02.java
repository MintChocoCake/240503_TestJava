package pack01;

public class BinaryTest02 {

	public static void main(String[] args) {
		
		// 카멜 : 첫자는 무조건 소문자 중간던어의 첫자를 대문자로 선언
		// 파스칼 : 첫자는 무조건 대문자 나머지 소문자
		
		int num = 122; // 10진수
		int bNum = 0b1111010; // 2진수
		int oNum = 0172; // 8진수
		int hNum = 0x7A; // 16 진수
		 
		System.out.println("10진수 : " + num);
		System.out.println("2진수 : " + bNum);
		System.out.println("8진수 : " + oNum);
		System.out.println("16진수 : " + hNum);
		
		System.out.println("====================");
		
		int i = 20;
		
		// 10진수 -> n 진수 변환 메서드 (10진수)
		String bString = Integer.toBinaryString(i); // 2진수
		String oString = Integer.toOctalString(i); // 8진수
		String hString = Integer.toHexString(i); // 16진수
		
		System.out.println("[ 10진수에서 변환 ]");
		System.out.println("10 -> 2 : " + bString);
		System.out.println("10 -> 8 : " + oString);
		System.out.println("10 -> 16 : " + hString);
		
		// n 진수 -> 10진수 변환 메서드 (변환하는진수, 변환하고자하는진수)
		int forBinary = Integer.parseInt(bString, 2);
		int forOctal = Integer.parseInt(oString, 8);
		int forHex = Integer.parseInt(hString, 16);
		
		System.out.println("[ 10진수로 변환 ]");
		System.out.println("2 -> 10 : " + forBinary);
		System.out.println("8 -> 10 : " + forOctal);
		System.out.println("16 -> 10 : " + forHex);
	
	}

}
