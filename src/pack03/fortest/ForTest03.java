package pack03.fortest;

public class ForTest03 {

	public static void main(String[] args) {
		// 0부터 100까지 수중 홀수의 합, 20이하 홀수

		int i;
		int total = 0;

		for (i = 0; i < 100; i++) {
			if (1 == (i % 2)) {
				total += i;
				if (i <= 20) {
					System.out.print(i + " ");
				}
			}
		}
		
		System.out.println();
		System.out.println("홀수 합 : " + total);

	}

}
