package pack04;

import javax.swing.JOptionPane;

public class ArrayTest02 {

	public static void main(String[] args) {
		
		final int LENGTH = 3;
		String[] students = new String[LENGTH];
		String[] phones = new String[LENGTH];
		
		for (int i = 0; i < LENGTH; i++) {
			students[i] = JOptionPane.showInputDialog("이름");
			phones[i] = JOptionPane.showInputDialog("전화번호");
		}

		for (int i = 0; i < LENGTH; i++) {
			System.out.println("이름 : "  + students[i]);
			System.out.println("이름 : "  + phones[i]);
		}
		
		
	}

}
