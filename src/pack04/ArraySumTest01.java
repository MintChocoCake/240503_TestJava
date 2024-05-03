package pack04;

public class ArraySumTest01 {

	public static void main(String[] args) {
		
		int[] score = { 98, 90, 87 };
		int sum = 0;
		double avg = 0.0;
		
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
			System.out.print("["+ i + " : " + score[i] + "]");
		}
		System.out.println();
		
		avg = (double)sum / score.length;
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg + "  반올림 : " + Math.round(avg));
		
	}

}
