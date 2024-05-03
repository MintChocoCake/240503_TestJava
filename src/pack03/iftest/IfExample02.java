package pack03.iftest;

import javax.swing.JOptionPane;

public class IfExample02 {

	public static void main(String[] args) {
		// 10 배수 판단
		
		int data = Integer.parseInt(JOptionPane.showInputDialog("값을 입력하세요."));
		
		int multipleCheck = data % 10;
		int multipleTen = data / 10;
		if (0 == multipleCheck) {
			System.out.println(data + " - 10 의 " + multipleTen + " 배수 입니다.");
		} else {
			System.out.println(data + " - 아닙니다.");
		}
		
	}

}
