package pack05;

import javax.swing.JOptionPane;

public class FuncTest03 {

	public static void Display(String[] _str) {	
		String result = "";
		for (String str : _str) {
			System.out.print("[" + str + "] ");
			result += str + " ";
		}
		System.out.println();
		System.out.println(result);
		JOptionPane.showMessageDialog(null, "요소 : " + result);
	}
	
	public static void main(String[] args) {
		String[] str = { "Java", "Oracle", "JSP", "HTML5", "CSS", "SpringBoot" };
		Display(str);
		
		FuncTest04 ch = new FuncTest04();
		ch.channelStr = "";
		
	}

}
