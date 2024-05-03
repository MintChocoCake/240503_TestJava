package pack04;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayDemo {

	public static void main(String[] args) {
		
		int[] numAry2 = new int [] { 1, 2, 3, 5, 4, 6, 10, 8, 9, 7 };
		Integer[] numAry3 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		String[] strAry1 = { "A", "B", "C", "D", "E" };
		
		// 오름차순 정렬
		Arrays.sort(numAry2);
		
		// 내림차순 정렬 : 기본 자료형은 사용 불가, 래퍼클래스 타입으로 사용해야 됨
		Arrays.sort(numAry3, Comparator.reverseOrder());;
		Arrays.sort(strAry1, Collections.reverseOrder());;
		
		System.out.println("[오름차순 1]");
		for (int i : numAry2) {
			System.out.println(i);
		}
		System.out.println("[내림차순 1]");
		for (int i : numAry3) {
			System.out.println(i);
		}
		System.out.println("[내림차순 2]");
		for (String str : strAry1) {
			System.out.println(str);
		}
		
		// 문자열 정렬.
		String str1 = "ABCDEFG";
		// 문자열을 잘라서 배열로 저장.
		String[] strAry2 = str1.split("");
		
		for (String str : strAry2) {
			System.out.print(str + " ");
		}
		System.out.println();
		
		// Stream 오름차순 정렬
		String streamSort1 = Stream.of(strAry2).sorted().collect(Collectors.joining());
		// Stream 내림차순 정렬
		String streamSort2 = Stream.of(strAry2).sorted(Comparator.reverseOrder()).collect(Collectors.joining());
		
		System.out.println("streamSort1 : " + streamSort1);
		System.out.println("streamSort2 : " + streamSort2);
		
	}

}
