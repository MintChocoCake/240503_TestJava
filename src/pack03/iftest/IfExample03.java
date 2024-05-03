package pack03.iftest;

import javax.swing.JOptionPane;

public class IfExample03 {

	public static void main(String[] args) {
		String grade = "";
		
		int score = Integer.parseInt(JOptionPane.showInputDialog("Jave Score"));
		
		// 방법1 
		if (90 <= score) grade = "A"; 
		else if (80 <= score) grade = "B";
		else if (70 <= score) grade = "C";
		else if (60 <= score) grade = "D";
		else if (50 <= score) grade = "E"; 
		else grade = "F";
		
		System.out.println("점수 : " + score + " 등급 : " + grade);
		
		String msg = "";
		
		if (90 <= score) { 
			grade = "A"; 
			msg = "최우수";
		} 
		else if (80 <= score) { 
			grade = "B"; 
			msg = "우수";
		}
		else if (70 <= score) { 
			grade = "C"; 
			msg = "평범";
		}
		else if (60 <= score) { 
			grade = "D"; 
			msg = "평범";
		}
		else if (50 <= score) { 
			grade = "E"; 
			msg = "평범";
		}
		else {
			grade = "F"; 
			msg = "평범";
		}
		
		System.out.println("점수 : " + score + " 등급 : " + grade + " 평가 : " + msg);
		
		
	}

}
