package packdemo.demotest;

import java.util.Scanner;

public class StringTest_1 {

	public static void main(String[] args) {
		
		// try-with-resources 로 Scanner 할당과 사용을 묶어 try 문이 끝나면 자동으로 
		// 할당된 Scanner 메모리가 바환되어 누수 발생 x 
		// -> 이거 사용안할시 Scanner.close() 메소드를 직접 호출해 닫아주면 됨
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("문자열 입력 : ");
			String str1 = sc.next();
			System.out.print("자를 문자열 입력 : ");
			String cutStr1 = sc.next();
			
			System.out.print("쪼갤 수 (사용 x : 0) : ");
			int cutIndex1 = sc.nextInt();
			
			String[] strArr = {};
			
			// String.split(자를 문자열, Index) : 문자열중 자를 문자를 기준으로 잘라서 배열에 담는다
			// 인덱스추가 입력 시 얼만큼 배열의 크기를 설정해 담을지.
			strArr = (0 >= cutIndex1) ? str1.split(cutStr1) : str1.split(cutStr1, cutIndex1);
			
			for (int i = 0; i < strArr.length; i++) {
				System.out.println(strArr[i]);
			}
		}
		
	}

}
