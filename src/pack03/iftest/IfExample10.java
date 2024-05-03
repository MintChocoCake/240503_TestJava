package pack03.iftest;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class IfExample10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String adminID = "admin";
		String adminPw = "1234";
		
		String inputId = JOptionPane.showInputDialog(null, "[아이디]", "아이디 입력", JOptionPane.QUESTION_MESSAGE);
		int inputPw =  0; 
		
		String msg = "";
		
		if (inputId.equals(adminID)) {
			inputPw =  Integer.parseInt(JOptionPane.showInputDialog(null, "[비밀번호]", "비밀번호 입력", JOptionPane.QUESTION_MESSAGE)); 
			
			if (inputPw == Integer.parseInt(adminPw)) {
				msg = inputId + " 관리자 어서오세요.";
				JOptionPane.showMessageDialog(null, msg, "title", JOptionPane.INFORMATION_MESSAGE);
			}
			else {
				msg = "비밀번호 오류.";
				JOptionPane.showMessageDialog(null, msg, "title", JOptionPane.WARNING_MESSAGE);
			}
		}
		else {
			msg = "아이디 오류.";
			JOptionPane.showMessageDialog(null, msg, "title", JOptionPane.ERROR_MESSAGE);
		}
		
		sc.close();
	}

}
