package pack05;

public class Example02 {

	public static int findMax(int[] _arr) {
		int max = 0;
		for (int i : _arr) {
			if (max < i) {
				max = i;
			}
		}
		
		return max;
	}
	
	public static void main(String[] args) {
		
		int[] numArr = { 7, 2, 9, 1, 5 };
		int max = findMax(numArr);
		
		System.out.println(max);
		
	}

}
