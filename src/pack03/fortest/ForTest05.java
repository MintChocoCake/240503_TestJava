package pack03.fortest;

import javax.swing.JOptionPane;

public class ForTest05 {

	public static void main(String[] args) {
		
		int a = 0;
		String msg = "";
		int result = 0;
		
		while (0 == result) {
			a = Integer.parseInt(JOptionPane.showInputDialog(null, "0보다 크면서 11보다 작은 숫자", "0"));
			
			if (0 < a && 11 > a) {
				msg = a + " : 조건에 만족합니다.";
				JOptionPane.showMessageDialog(null, msg, "결과", 
						JOptionPane.INFORMATION_MESSAGE);
				break;
			}
			else {
				msg = a + " : 조건에 만족하지 않습니다. \n다시 입력하시겠습니까 ?";
				//JOptionPane.showMessageDialog(null, msg, "결과", JOptionPane.WARNING_MESSAGE);
				result = JOptionPane.showConfirmDialog(null, msg, "결과", 
						JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
			}
		}

	}

}
