package packdemo.demo;

public class QuickSortDemo {
	
	// QuickSort
	public void QuickSort(int[] _ary, int _left, int _right) {
		int pivot = _ary[_right]; // 오른쪽 끝 값 피벗값 설정
		int i = _ary[_left]; // 왼쪽 끝 값
		int j = _ary[(_right - 1)]; // 피벗값 제외 오른쪽 끝 값
		
		while (true) {
			// 재귀호출로 중앙까지?
			if (i > pivot) {
				swap(_ary, _left, (_right - 1));
			}
		}
		
		
	}
	
	// swap _ary[i] <--> _ary[j]
	public void swap (int[] _ary, int _i, int _j) {
		int temp = _ary[_i];
		_ary[_i] = _ary[_j];
		_ary[_j] = temp;
	}
	
	
	public static void main(String[] args) {
		
	} // main
} // class
