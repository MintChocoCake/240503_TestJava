package packdemo.demotest;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class StringTest {

	public static void main(String[] args) {
		// String 메서드
		String String1 = "String1";
		String String2 = "String2";

		// "문자열".메서드() 형식의 사용도 가능 ! ex) "String".length()

		// charAt(Index) : 문자열의 해당 인덱스 문자 리턴 (길이 초과시 에러)
		char ch1 = String1.charAt(6);
		System.out.println("charAt : " + ch1);

		// 문자열1.equals(문자열2) : 문자열 비교 -> 같음 true, 다름 false
		boolean isequal = String1.equals(String2);
		System.out.println("equals : " + isequal);

		// getBytes : byte[]로 리턴 -> 문자 하나마다의 비트를 배열로 담아 리턴
		// 네트워크 문자열 전송, 문자열 암호화에 사용
		byte[] bytes1 = "LostArk".getBytes();
		System.out.print("[getBytes] ");
		for (int i = 0; i < bytes1.length; i++) {
			System.out.print(bytes1[i] + " ");
		}
		System.out.println();

		System.out.print("[getBytes] (char) ");
		for (int i = 0; i < bytes1.length; i++) {
			System.out.print((char) bytes1[i] + " ");
		}
		System.out.println();

		// toString(전달할 값) : 전달한 값을 문자열로 변환(String)
		byte[] bytes2 = String1.getBytes();
		System.out.println("toString(byte[]) : " + Arrays.toString(bytes2));

		// getBytes(인코딩할 문자셋) : 특정 문자셋으로 인코딩된 바이트 배열 리턴
		// UTF-8 : 알파벳 1byte, 한글 3byte
		// EUC-KR : 알파벳 1byte, 한글 2byte
		// getBytes(Charset)은 실패시 UnsupportedEncodingException 리턴 -> try catch 사용
		try {
			byte[] bytes3 = "MoCoCo".getBytes("UTF-8");
			System.out.println("getBytes(Charset) : " + Arrays.toString(bytes3));
			for (int i = 0; i < bytes3.length; i++) {
				System.out.print((char) bytes3[i] + " ");
			}
			System.out.println();
		} catch (UnsupportedEncodingException e) {
			System.out.println("catch");
		}

		// File 타입은 파일경로 사용할 때 사용하는 듯 -> 이걸 toString()하면 String 타입이 됨
		// + toString() 메서드는 자동으로 호출됨
		File filepath = new File("d||test");
		System.out.println("filepath : " + filepath);
		System.out.println("toString(File) : " + filepath.toString());

		// indexOf(찾으려는문자) : 문자열중 해당 문자의 위치 리턴 -> 못찾으면 -1 리턴
		int strIndex1 = "String".indexOf('g');
		System.out.println("[String] indexOf(g) : " + strIndex1);
		int strIndex2 = "String".indexOf('a');
		System.out.println("[String] indexOf(a) : " + strIndex2);

		// length() : 문자열 길이
		int strlen = String1.length();
		System.out.println("length : " + strlen);

		// replace(A, B) : 문자열의 A를 B로 바꿈
		CharSequence target = "S";
		CharSequence replacement = "T";
		String replaceStr1 = String1.replace(target, replacement);
		System.out.println("[CharSequence]replace : " + replaceStr1);

		String replaceStr2 = String1.replace('1', '3');
		System.out.println("[char]replace : " + replaceStr2);

		// substring(인덱스) : 인덱스 위치에서 끝까지 자른 문자열 리턴
		String subString1 = String1.substring(3);
		System.out.println("substring(index) : " + subString1);

		// substring(인덱스1, 인덱스2) : 인덱스1 에서 인덱스2까지 자른 문자열 리턴
		String subString2 = String1.substring(2, 4);
		System.out.println("substring(index1, index2) : " + subString2);

		// toLowerCase : 문자열 전체를 소문자로 변환해 리턴
		String lowString = String1.toLowerCase();
		System.out.println("toLowerCase : " + lowString);

		// toUpperCase : 문자열 전체를 대문자로 변환해 리턴
		String UpString = String1.toUpperCase();
		System.out.println("toUpperCase : " + UpString);

		// trim : 문자열의 앞뒤 공백을 제거해 리턴
		String trimstr = "   Is Trim String  !  ";
		System.out.print("not trim : [" + trimstr);
		System.out.println("]");
		System.out.print("trim : [" + trimstr.trim());
		System.out.println("]");

		// String.valueOf(타입값) : 기본 타입값을 String타입으로 리턴
		System.out.println("valueOf(int) : " + String.valueOf(2));
		System.out.println("valueOf(double) : " + String.valueOf(2.2));

		// 문자열 결합
		// 문자열1+문자열2
		String strcat1 = "Lost" + "Mococo";
		System.out.println("+ : " + strcat1);
		// 문자열1.concat(문자열2)
		String strcat2 = strcat1.concat("Nol");
		System.out.println("concat : " + strcat2);
		// StringBuffeer 의 append(문자열)
		// String 임시객체 생성 방지 + 메모리 절약
		StringBuffer sbf = new StringBuffer();
		sbf.append("Is String ");
		sbf.append("Buffer append");
		System.out.println("SBF .append : " + sbf.toString());

	}

}
