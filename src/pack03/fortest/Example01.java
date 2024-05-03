package pack03.fortest;


import javax.swing.JOptionPane;

public class Example01 {
	public static void main(String[] args) {
		// 몇명의 성적을 입력 받을 것이지 (정수) + 총점과 평균
		
		int result = 0;
		int count = 0;
		
		while (0 == result) {
			count = Integer.parseInt(JOptionPane.showInputDialog(null, "학생 수", "1단계", 
					JOptionPane.INFORMATION_MESSAGE));
			
			double[] scores = new double[count];
			double total = 0.0;
			double arg = 0.0;
			String msg1 = "";
			
			for (int i = 0; i < count; i++) {
				msg1 = "성적 입력 : " + (i + 1) + " / " + count;
				scores[i] = Double.parseDouble(JOptionPane.showInputDialog(null, msg1,
						"2단계", JOptionPane.INFORMATION_MESSAGE));
				
				total += scores[i];
			}
			
			arg = total / (double)count;
			
			String msg = count + "명  총점 : " + total + "  평균 : " + arg;
			
			String[] options = { "재입력", "확인" };
			result = JOptionPane.showOptionDialog(null, msg, "결과", 0,
					JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
		}
		
		// 몇명의 성적을 입력 받을 것이지 (정수) + 총점과 평균
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.print("학생 수 : ");
		int count = sc.nextInt();
		
		int[] score = new int[count];
		int total = 0;
		double avg = 0.0;
		
		for (int i = 0; i < count; i++) {
			System.out.print((i + 1) + "번째 성적 : ");
			score[i] = sc.nextInt();
			
			total += score[i];
		}
		avg = total / 3.0;
		
		System.out.println(count + " 명 점수 합 : " + total + ", 평균 : " + avg);
		sc.close();
		*/
		
	}
}
