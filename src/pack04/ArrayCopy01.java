package pack04;

import java.util.Arrays;

public class ArrayCopy01 {

	public static void main(String[] args) {
		
		int[] arr1 = { 10, 20, 30, 40, 50 }; 
		int[] arr2 = { 1, 2, 3, 4, 5 }; 
		int[] arr3 = new int[5];
		
		System.out.println("=====[arr1]=====");
		
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		
		System.out.println("=====[arr2]=====");
		
		// 복사할 배열, 복사할 길이
		arr2 = Arrays.copyOf(arr1, arr1.length);

		for (int i : arr2) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		System.out.println("=====[arr3]=====");
		
		// 복사할 배열, 복사할 첫 위치, 대상 배열, 붙여넣을 첫 위치, 복사할 요소 개수
		System.arraycopy(arr1, 0, arr3, 1, 3);

		for (int i : arr3) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		
	}

}
