package pack03.iftest;

import javax.swing.JOptionPane;

public class IfExample09 {

	public static void main(String[] args) {
		// 데이터 셋
		String id = "soldesk";
		int pw = 1234;
		
		// 고객
		String inputId = JOptionPane.showInputDialog("아이디");
		int inputPw = Integer.parseInt(JOptionPane.showInputDialog("비번"));
		
		String msg = "";
		String titleMsg = "Is Title";
		if (id.equals(inputId)) {
			if (pw == inputPw) {
				// (부모컴포넌트(주로 null) , 판업 상자에 표시될 내용, 판업 상자 타이틀, 아이콘 타입)
				// 아이콘 타입 : ERROR_MESSAGE, INFORMATION_MESSAGE, QUESTION_MESSAGE, WARNING_MESSAGE
				msg = id + " 님 환영 합니다.";
				JOptionPane.showMessageDialog(null, msg, titleMsg, JOptionPane.INFORMATION_MESSAGE);
			}
			else {
				msg = "비밀 번호가 다릅니다.";
				JOptionPane.showMessageDialog(null, msg, titleMsg, JOptionPane.ERROR_MESSAGE);
			}
		}
		else {
			msg = "아이디가 다릅니다.";
			JOptionPane.showMessageDialog(null, msg, titleMsg, JOptionPane.ERROR_MESSAGE);
		}
		
	}

}
