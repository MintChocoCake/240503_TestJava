package pack04;

import java.util.Random;

import javax.swing.JOptionPane;

public class MyLotto {

	public static void main(String[] args) {

		int[] lottoArr = new int[6];
		int count = 0;
		int num = 0;

		Random ran = new Random();

		System.out.println("=====[이번주 로또 예상번호]=====");
		num = Integer.parseInt(JOptionPane.showInputDialog(null, "원하는 로또 구매횟수", "입력", JOptionPane.QUESTION_MESSAGE));
		
		int a = 0;
		boolean debug = false;

		while (num > count) {
			System.out.println("[" + (count + 1) + "] :");
			count++;

			for (int i = 0; i < lottoArr.length; i++) {

				if (debug) {
					if (1 == a) {
						a = 0;
						System.out.print("[i start]");
					}

					System.out.print("[start]");
				}

				lottoArr[i] = ran.nextInt(45) + 1;

				for (int j = 0; j < lottoArr.length; j++) { // 중복체크
					if (debug) {
						if (1 == a) {
							a = 0;
							System.out.print("[j start]");
						}
					}

					if (i != j && lottoArr[i] == lottoArr[j]) {
						if (debug) {
							System.out.print(
									"[i : " + i + " - " + lottoArr[i] + " j : " + j + " - " + lottoArr[j] + "] ");
						}

						if (0 == j)
							j = 0;
						else if (0 < j)
							j--;

						if (debug) {
							System.out.print("[continue]");
							a = 1;
						}
						
						lottoArr[i] = ran.nextInt(45) + 1;
						continue;

					}
				}

				if (debug) {
					System.out.print("[print]");
				}

				System.out.print(lottoArr[i] + " ");
			}
			System.out.println();
		}

	}
}
