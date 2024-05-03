package pack03.whiletest;

import javax.swing.JOptionPane;

public class Do_WhileTest06 {

	public static void main(String[] args) {
		
		int num1 = 0;
		int num2 = 0;
		
		do {
			num1 = Integer.parseInt(JOptionPane.showInputDialog("OTP DB"));
			num2 = Integer.parseInt(JOptionPane.showInputDialog("OTP USER"));
			
			if (num1 == num2) {
				System.out.println("인증 성공 !");
			}
			else {
				System.out.println("다시 입력 !");
			}
			
		} while (num1 != num2);

	}

}
