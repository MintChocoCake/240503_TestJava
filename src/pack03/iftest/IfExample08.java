package pack03.iftest;

import javax.swing.JOptionPane;

public class IfExample08 {

	public static void main(String[] args) {
		
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("[값 1]"));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("[값 2]"));
		
		if (num1 > num2) {
			System.out.println(num1 + " > " + num2);
		} 
		else if (num1 < num2) {
			System.out.println(num1 + " < " + num2);
		} 
		else {
			System.out.println(num1 + " == " + num2);
		}
		
		
	}

}
