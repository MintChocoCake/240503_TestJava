package packdemo.demo;

import java.util.Random;

public class SortDemo01 {

	public int[] randomArr(Random _ran, int[] _arr) {
		for (int i = 0; i < _arr.length; i++) {
			_arr[i] = _ran.nextInt(100) + 1;
		}
		
		return _arr;
	}
	
	public void printArr(int[] _arr, String _title) {
		
	}
	
	public int[] sortAscendingArr(int[] _arr) {
		int temp = 0;
		for (int i = 0; i < _arr.length; i++) {
			for (int j = 0; j < _arr.length; j++) {
				if (i != j && _arr[i] < _arr[j]) {
					System.out.print("[ i : " + i + "] ");
					System.out.println("[ j : " + j + "] - ");
					System.out.println("[(i - " + _arr[i] + ") <-> (j - " + _arr[j] + ")] ");
					temp = _arr[i];
					_arr[i] = _arr[j];
					_arr[j] = temp;
				}
			}
		}

		return _arr;
	}

	public int[] sortDescendingArr(int[] _arr) {
		int temp = 0;
		for (int i = 0; i < _arr.length; i++) {
			for (int j = 0; j < _arr.length; j++) {
				if (i != j && _arr[i] > _arr[j]) {
					System.out.println("[ i : " + i + "] " + "[ j : " + j + "]");
					System.out.println("(i - " + _arr[i] + ") <-> (j - " + _arr[j] + ") ");
					temp = _arr[i];
					_arr[i] = _arr[j];
					_arr[j] = temp;
				}
			}
		}

		return _arr;
	}

	public static void main(String[] args) {
		
		SortDemo01 sortDemo = new SortDemo01();
		
		Random ran = new Random();
		
		final int SIZE_ARR = 10;
		int[] arr01 = new int[SIZE_ARR];
		int[] arr02 = new int[SIZE_ARR];
		
		arr01 = sortDemo.randomArr(ran, arr01);
		arr01 = sortDemo.randomArr(ran, arr02);
		
		System.out.println("=====[Before Sort]=====");
		System.out.println("arr01");
		for (int i : arr01) {
			System.out.print("[" + i + "] ");
		}
		System.out.println();
		
		System.out.println("arr02");
		for (int i : arr02) {
			System.out.print("[" + i + "] ");
		}
		System.out.println();
		
		arr01 = sortDemo.sortAscendingArr(arr01);
		arr02 = sortDemo.sortAscendingArr(arr02);
		
		System.out.println("=====[After Sort]=====");
		System.out.println("arr01");
		for (int i : arr01) {
			System.out.print("[" + i + "] ");
		}
		System.out.println();
		
		System.out.println("arr02");
		for (int i : arr02) {
			System.out.print("[" + i + "] ");
		}
		System.out.println();
		
	}

}
