package pack04;

import javax.swing.JOptionPane;

public class ArrayTest05 {

	public static void main(String[] args) {
		
		String[] str = { "고길동", "둘리", "또치", "뽀또" };
		String res = "";
		
		for (int i = 0; i < str.length; i++) {
			res += str[i] + "\n";
		}
		
		JOptionPane.showMessageDialog(null, "[영웅들]\n" + res);

	}

}
