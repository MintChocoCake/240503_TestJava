package pack02;

public class ArithTest01 {

	public static void main(String[] args) {
		// 총점, 평균 출력
		int math = 96;
		int eng = 87;
		
		int total = math + eng;
		double average = (double)total / 2;
		
		System.out.println("Total : " + total);
		System.out.println("Average : " + average);
		
		System.out.println("====================");
		
		// +, -, *, /, % -> 5개 결과 (나누기 소숫점 발생)
		
		int a1 = 5;
		int a2 = 2;
		
		int plus = a1 + a2;
		int minus = a1 - a2;
		int multiply = a1 * a2;
		double divide = (double)a1 / a2;
		int remain = a1 % a2;
		
		System.out.println("plus : " + plus);
		System.out.println("minus : " + minus);
		System.out.println("multiply : " + multiply);
		System.out.println("divide : " + divide);
		System.out.println("remain : " + remain);
		
	}

}
