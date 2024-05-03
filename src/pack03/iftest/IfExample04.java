package pack03.iftest;

import javax.swing.JOptionPane;

public class IfExample04 {

	public static void main(String[] args) {
		// 전시관 입장료
		// 미취학 아동 1000, 초등 2000, 중고등 3500, 성인 5000
		
		int age = Integer.parseInt(JOptionPane.showInputDialog("나이 입력"));
		
		String msg = "";
		int money = 0;
		
		if (19 < age) {
			msg = "성인";
			money = 5000;
		}
		else if (13 < age) {
			msg = "중.고등 학생";
			money = 3500;
		}
		else if (7 < age) {
			msg = "초등 학생";
			money = 2000;
		}
		else {
			msg = "미취학 아동";
			money = 1000;
		}
		
		System.out.println("나이 : " + age + "\t" + msg + "\t" + "요금 : " + money);
		
	}

}
