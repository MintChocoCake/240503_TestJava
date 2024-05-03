package pack03.whiletest;

public class Example02 {

	public static void main(String[] args) {
		// 팩토리얼 알고리즘
		// 5! -> 5 x 4 x 3 x 2 x 1 
		// n! : n * (n-1) * (n-2) * (n-3) * (n-4)
		
		int num = 5;
		int factorial = 1;
		
		// 숫자가 0이 아닐 때까지 반복하는 팩토리얼 계산
		while (0 != num) {
			factorial *= num--;
		}
		
		System.out.println("팩토리얼 : " + factorial);
		
	}

}
