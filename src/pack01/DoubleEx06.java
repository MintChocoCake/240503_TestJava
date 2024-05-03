package pack01;

public class DoubleEx06 {

	public static void main(String[] args) {
		// bit -> byte -> short -> int -> long
		// 실수 : float(4byte) -> double(8byte)
		// 문자 : char('')
		// 문자열 : String("")
		
		 char ch = 'c';
		 String str = "str";
		
		 float fnum = 3.14f; // 4바이트 (f 안붙이면 에러)
		 double dnum = 3.14; // 8바이트 (자동으로 float으로 형 변환)
		 
		 System.out.println(ch);
		 System.out.println(str);
		 System.out.println("fnum : " + fnum);
		 System.out.println("dnum : " + dnum);
		 
	}

}
