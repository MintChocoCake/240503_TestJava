package packdemo.algorithm.chap02;

import java.util.Scanner;

public class Algorithm04 {

	public static void print(int[] _arr, String _title) {
		System.out.println(_title);
		for (int i = 0; i < _arr.length; i++) {
			System.out.println("[" + i + "]" + _arr[i]);
		}
	}
	
	public static boolean equals(int[] _arr1, int[] _arr2) {
		if (null == _arr1 || null == _arr2) {
			return false;
		}
		
		for (int i = 0; i < _arr1.length; i++) {
			if (_arr1[i] != _arr2[i]) {
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		// 두 배열 수 비교
		// 2장 11
		
		Scanner sc = new Scanner(System.in);
		int count = 0;
		
		int[] arr1 = null;
		int[] arr2 = null;
		
		while (null == arr1 || null == arr2) {
			System.out.print("두 배열 요소 수 : ");
			count = Integer.parseInt(sc.nextLine());
			
			if (1 > count) {
				continue;
			}
			
			arr1 = new int[count];
			arr2 = new int[count];	
		}
		
		for (int i = 0; i < count; i++) {
			System.out.print("[arr 1] " + i + "/" + arr1.length + " : ");
			arr1[i] = Integer.parseInt(sc.nextLine());
			
			System.out.print("[arr 2] " + i + "/" + arr2.length + " : ");
			arr2[i] = Integer.parseInt(sc.nextLine());
		}
	
		
		print(arr1, "[arr 1]"); 
		print(arr2, "[arr 2]"); 
		
		boolean isEquals = equals(arr1, arr2);
		System.out.println("Equals : " + isEquals);
		
		sc.close();
		
	}

}
