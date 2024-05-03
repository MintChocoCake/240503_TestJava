package pack04;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ArrayTest01 {

	public static void main(String[] args) {
		
		int[] numAry1 = new int [10];
		int[] numAry2 = new int [] { 1, 2, 3, 5, 4, 6, 10, 8, 9, 7 };
		Integer[] numAry3 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		String[] strAry = { "A", "B", "C", "D", "E" };
		
		// 오름차순 정렬
		Arrays.sort(numAry2);
		
		// 내림차순 정렬 : 기본 자료형은 사용 불가, 래퍼클래스 타입으로 사용해야 됨
		Arrays.sort(numAry3, Comparator.reverseOrder());;
		Arrays.sort(strAry, Collections.reverseOrder());;
		
		
		System.out.println("[오름차순 1]");
		for (int i : numAry2) {
			System.out.println(i);
		}
		System.out.println("[내림차순 1]");
		for (int i : numAry3) {
			System.out.println(i);
		}
		System.out.println("[내림차순 2]");
		for (String str : strAry) {
			System.out.println(str);
		}
		
		
	}

}
