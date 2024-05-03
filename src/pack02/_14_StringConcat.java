package pack02;

import java.util.Scanner;

public class _14_StringConcat {

	public static void main(String[] args) {
		// String서 +는 산술연산자가 아닌 부호연산자로(서로 결합하는 연산자) 사용
		// 단, 반드시 문자열이 먼저 선언 되어야 함
		String str1 = " " + 14;
		String str2 = str1 + "  사용";
		System.out.println(str2);
		// 어떤 것이 먼저 연산 되느냐에 따른 결과
		String str3 = "JDK " + 11 + 13;
		String str4 = 11 + 13 + " JDK";
		System.out.println(str3);
		System.out.println(str4);
		
		System.out.println("====================");		
		// " 출력하고 싶을때 \을 앞에 붙이고 출력하면 됨
		String strTest = "\"해위 해위\"";
		System.out.println(strTest);
		
		String strTest1 = "해위해위";
		// 문자열.charAt(Index) : 문자열중 해당 Index번째의 문자를 char타입으로 반환 
		char chTest1 = strTest1.charAt(1);
		System.out.println(chTest1);
		
		Scanner sc = new Scanner(System.in);
		
		String strTest2 = "";
		char chTest2;
		int index = 0;
		
		System.out.print("charAt Index : ");
		index = sc.nextInt();
		System.out.print("아무말 입력 : ");
		strTest2 = sc.next();
		
		boolean isIndexOver = (index > strTest2.length()) ? true : false;
		
		if (isIndexOver) {
			System.out.println("index 길이 초과");
		} else {
			chTest2 = strTest2.charAt(index);
			System.out.println(strTest2);
			System.out.println(chTest2);
		}
		
		sc.close();
		
	}

}
