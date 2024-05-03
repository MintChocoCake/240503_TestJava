package pack04;

public class ArgsTest01 {

	public static void main(String[] args) {
		
		int[] numbers = new int[5];
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = 10 + (10 * i);
		}
		
		for (int i : numbers) {
			System.out.println(i);
		}

	}

}
