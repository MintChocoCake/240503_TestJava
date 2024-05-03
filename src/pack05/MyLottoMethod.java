package pack05;

import javax.swing.JOptionPane;

public class MyLottoMethod {

	public static boolean contains(int[] _arr, int _num) {

		for (int i = 0; i < _arr.length; i++) {
			if (_arr[i] == _num) {
				System.out.println(i + ") [arr : " + _arr[i] + "] == [num : " + _num + "]");
				return true;
			}
		}

		return false;
	}

	public static void main(String[] args) {

		int number = Integer.parseInt(JOptionPane.showInputDialog("로또 구매횟수 입력"));
		int cnt = 0;

		System.out.println("==== 이번주 로또 예상번호 ====");

		while (number > cnt) {
			int[] lotto = new int[6];
			int index = 0;

			System.out.print("[" + (cnt + 1) + "] : ");

			for (index = 0; index < 6;) {
				int num = (int) (Math.random() * 45) + 1;
				if (!contains(lotto, num)) { // 중복 체크
					lotto[index++] = num;
				}
			}

			for (int num : lotto) {
				System.out.print(num + " ");
			}
			System.out.println();
			cnt++;

		} // while

	} // main

} // class
