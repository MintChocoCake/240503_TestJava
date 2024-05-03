package packdemo.algorithm.chap02;

import java.util.Scanner;

public class Algorithm05 {

	// 정수, 변환할 차수, 결과
	public static int cardConvN(int _num, int _n, char[] _result) {
		String d = "0123456789ABCDEFGHIJKLMNOPQRSTU";
		int index = 0; // 자릿수 측정
		
		int resultDivide = 0;
		
		while (0 < _num) {
			_result[index] = d.charAt(_num % _n);
			System.out.print("[_result[index] : " + _result[index++] + "] ");
			resultDivide = _num /= _n;
			
			System.out.println("[_num / _n : " + resultDivide + "]");
		}
		
		return index;
	}
	
	public static void main(String[] args) {
		// 10진수를 입력받아 2~36진수로 변환
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = Integer.parseInt(sc.nextLine());
		
		System.out.print("변환할 n 진수 : ");
		int n = Integer.parseInt(sc.nextLine());
		
		char[] resultChar = new char[10];
		int resultIndex = 0;
		
		resultIndex = cardConvN(num, n, resultChar);
		
		System.out.println("resultIndex : " + resultIndex);
		
		for (int i = 0; i < resultIndex; i++) {
			System.out.print(resultChar[i] + " ");
		}
		
		System.out.println();
		
		for (char ch : resultChar) {
			System.out.print(ch + " ");
		}
		
		sc.close();
	}

}
