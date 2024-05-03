package pack03.whiletest;

public class Do_WhileTest05 {

	public static void main(String[] args) {

		int num = 1;
		int sum = 0;

		do {
			sum += num;
			num++;
		} while (10 > num);
		System.out.println("1 ~ 10 까지 합 : " + sum);
		
		
	}
}