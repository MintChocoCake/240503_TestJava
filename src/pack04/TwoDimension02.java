package pack04;

import javax.swing.JOptionPane;

public class TwoDimension02 {

	public static void main(String[] args) {
		
		int[][] javaScore = new int[2][3];
		
		int index = 0;
		
		for (int i = 0; i < javaScore.length; i++) {
			for (int j = 0; j < javaScore[i].length; j++) {
				index = (i * javaScore[i].length) + j;
				int jumsu = Integer.parseInt(JOptionPane.showInputDialog(index + ". JAVA 점수 "));
				javaScore[i][j] = jumsu;
				System.out.println("javaScore[" + i + "][" + j + "]");
			}
			System.out.println();
		}
		
		
	}

}
