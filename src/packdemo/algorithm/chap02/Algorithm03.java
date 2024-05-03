package packdemo.algorithm.chap02;

import java.util.Scanner;

public class Algorithm03 {

	public static void Input(Scanner _sc, int[] _arr) {
		for (int i = 0; i < _arr.length; i++) {
			System.out.print(i + " / " + _arr.length + " : ");
			_arr[i] = Integer.parseInt(_sc.nextLine());
		}
	}
	
	public static void print(String _name, int[] _arr) {
		System.out.println(_name);
		for (int i : _arr) {
			System.out.print("[" + i + "] ");
		}
		System.out.println();
	}
	
	public static void reverseSort(int[] _arr) {
		int temp = 0;
		for (int i = 0; i < _arr.length; i++) {
			for (int j = 0; j < _arr.length; j++) {
				if (i != j && _arr[i] > _arr[j]) {
					temp = _arr[i];
					_arr[i] = _arr[j];
					_arr[j] = temp;
				}
			}
		}
	}
	
	public static void reverse(int[] _arr) {
		int temp = 0;
		for (int i = 0; i < _arr.length; i++) {
			for (int j = 0; j < _arr.length; j++) {
				if (i != j && i < j) {
					temp = _arr[i];
					_arr[i] = _arr[j];
					_arr[j] = temp;
				}
			}
		}
	}
	
	public static void swap(int[] _arr, int _index1, int _index2) {
		if (0 > _index1 || _arr.length < _index1
				|| 0 > _index2 || _arr.length < _index2) {
			return;
		}
		int temp = 0;
		
		temp = _arr[_index1];
		_arr[_index1] = _arr[_index2];
		_arr[_index2] = temp;
	}
	
	public static void reverseTest(int[] _arr) {
		for (int i = 0; i < _arr.length / 2; i++) {
			swap(_arr, i, _arr.length - i -1);
		}
	}
	
	public static void main(String[] args) {
		// 배열 역순 정렬
		
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int[] arr = null;
		
		while (null == arr) {
			System.out.print("배열 개수 : ");
			count = Integer.parseInt(sc.nextLine());
			
			if (1 > count)
				continue;
			
			arr = new int[count];
		}
		
		Input(sc, arr);
		
		print("정렬 전", arr);
		reverseTest(arr);
		print("정렬 후", arr);
		
		sc.close();
	}

}
