package pack04;

public class EnhancedForLoop02 {

	public static void main(String[] args) {
		
		int[] numbers = { 10, 20, 30, 40, 50 };
		int sum = 0;
		
		for (int i : numbers) {
			System.out.print(i + " ");
			sum += i;
		}
		System.out.println();
		System.out.println("sum : " + sum);

		
	}
}
