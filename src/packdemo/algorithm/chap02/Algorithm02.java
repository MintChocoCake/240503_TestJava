package packdemo.algorithm.chap02;

import java.util.Scanner;

public class Algorithm02 {

	public static void main(String[] args) {
		// 배열값 입력 후 최대값 구하기
		
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int[] arr = null;
		int max = 0;
		
		while (null == arr) {
			System.out.print("배열 갯수 : ");
			count = Integer.parseInt(sc.nextLine());
			
			if (1 > count)
				continue;
			
			arr = new int[count];
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(i + " / " + arr.length + " : ");
			arr[i] = Integer.parseInt(sc.nextLine());
		}
		
		for (int i : arr) {
			if (max < i)
				max = i;
			System.out.print(i + " ");
		}
		System.out.println();
		
		System.out.println("최대값 : " + max);
		
		sc.close();
	}

}
