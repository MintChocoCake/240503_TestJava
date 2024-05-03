package pack03.iftest;

public class IfExample06 {

	public static void main(String[] args) {
		// 1~6점 까지 받을 수 있음 각 점수당 분식 쏘기
		
		// Math.random() : 0~1 (1 미포함) 구간에서 부동소수점 난수 생성
		int randNum = (int)(Math.random() * 6) + 1;
		
		for (int i = 0; i < 10; i++) {
			double rand = Math.random() * 6;
			int a = 0;
		}
		
		// Math.round(double) : 반올림
		// Math.ceil(double) : 올림
		// Math.floor(double) : 내림
		
		if (1 == randNum) {
			System.out.println("1점 : 순대");
		} else if (2 == randNum) {
			System.out.println("2점 : 오징어 튀김");
		} else if (3 == randNum) {
			System.out.println("3점 : 순대");
		} else if (4 == randNum) {
			System.out.println("4점 : 순대");
		} else if (5 == randNum) {
			System.out.println("5점 : 순대");
		} else if (6 == randNum) {
			System.out.println("6점 : 순대");
		} else {
			System.out.println("설정없음");
		}
		
	}

}
