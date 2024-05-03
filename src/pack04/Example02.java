package pack04;

public class Example02 {
	
	public static void main(String[] args) {
		// 배열에서 최대값 찿아서 출력
		
		int max = 0;
		
		int[] array = { 1, 6, 9, 2, 35, 178, 234, 4, 5, 11 };
		
		for (int i = 0; i < array.length; i++) {
			if (max < array[i])
				max = array[i];
		}
		System.out.println("Max : " + max);
		
		int min = max;
		
		for (int i : array) {
			if (min > i)
				min = i;
		}
		System.out.println("Min : " + min);
		
		
		int temp = 0;  // 값 교환용
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("[ i : " + i + "]");
			for (int j = 0; j < array.length; j++) {
				System.out.print("j : " + j + " - ");
				// array[i] < array[j] : 오름차순 , array[i] > array[j] : 내림차순
				if (i != j && array[i] < array[j]) {
					System.out.print("[swap before : (i - " + array[i] + ") <-> (j - " + array[j] + ")] ");
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
					System.out.print("[swap afther : (i - " + array[i] + "), (j - " + array[j] + ")] ");
				}
				System.out.println();
			}		
		}
		
		System.out.println("array");
		for (int i : array) {
			System.out.print("[" + i +"] ");
		}
		
		
	}

}
