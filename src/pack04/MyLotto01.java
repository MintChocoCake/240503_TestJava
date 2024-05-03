package pack04;

import java.util.Random;

import javax.swing.JOptionPane;

public class MyLotto01 {

	public static void main(String[] args) {

		int[] lottoArr = new int[6];
		int count = 0;
		int num = 0;

		Random ran = new Random();

		System.out.println("=====[이번주 로또 예상번호]=====");
		num = Integer.parseInt(JOptionPane.showInputDialog(null, "원하는 로또 구매횟수", "입력", JOptionPane.QUESTION_MESSAGE));

		while (num > count) {
			System.out.println("[" + (count + 1) + "] :");
			
			/* (라벨)outer : */ for (int i = 0; i < lottoArr.length; i++) {
				lottoArr[i] = ran.nextInt(45) + 1;
				
				for (int j = 0; j < i; j++) { // 중복체크
					if (lottoArr[i] == lottoArr[j]) {
						j--;
						lottoArr[i] = ran.nextInt(45) + 1;
						continue /* (라벨)outer */;
						// continue 시 outer을 만나 미리 붙여놓은 라벨(outer :) 의 for문에서 진행한다. 
					}
				}

				System.out.print(lottoArr[i] + " ");
			}
			
			System.out.println();
			count++;
		}
		
	}
}
