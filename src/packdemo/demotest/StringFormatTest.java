package packdemo.demotest;

import java.util.Date;
import java.util.Locale;

public class StringFormatTest {

	public static void main(String[] args) {
		
		double dNum01 = 123.456789;
		int iNum02 = 123456789;
		
		String str01 = "tntntntn";
		
		Date today = new Date();
		
		// %d(10진수), %f(실수형), %s(문자형), %t(날짜시간), %c(유니코드), %o(8진수), %x(16진수)  
		// %6 표시할 숫자 길이 설정 (기본설정 6) - 길이 안맞을 경우 에러
		// 기본 : 오른쪽 정렬, - 붙일 경우 왼쪽 정렬 
		
		System.out.println("=====[%f 실수]=====");
		
		System.out.println(String.format("%15f_", dNum01));
		System.out.println(String.format("%-15f_", dNum01));
		// % 와 길이 정수 사이 0을 붙이면 공백에 0이 출력됨 (0 뒤나 앞에 - 붙일시 에러)
		System.out.println(String.format("%015f_", dNum01));
		// 길이 뒤에 .n 설정 시 소숫점 n 자리 까지 출력 (소숫점 반올림 하여 출력함)
		System.out.println(String.format("%15.4f_", dNum01));
		
		System.out.println("=====[%d 정수(10진수)]=====");

		System.out.println(String.format("%15d_", iNum02));
		System.out.println(String.format("%-15d_", iNum02));
		// %,d : 3자리 단위로 쉼표 찍음
		System.out.println(String.format("%,15d_", iNum02));
		
		System.out.println("=====[%s 문자열]=====");
		
		// 문자열은 %s 출력 시 문자열을 그대로 출력 
		System.out.println(String.format("%s_", str01));
		// 문자열은 , 붙이면 에러.
		// -> System.out.println(String.format("%,15s_", str01));
		System.out.println(String.format("%15s_", str01));
		System.out.println(String.format("%-15s_", str01));
		
		// 길이 정수 뒤에 .n 설정 시 n길이만큼 문자열 출력
		System.out.println(String.format("%-15.5s_", str01));
		
		System.out.println("=====[Local]=====");
		int money = 35000;
		System.out.println(String.format(Locale.JAPAN, "%,d", money));
		
		
	}

}
