package pack04;

public class Example01 {

	public static void main(String[] args) {
		// for문을 이용하여 다음 배열의 점수를 줄단위로 평균을 구하시오
		int[][] arr = { { 95, 86 }, { 83, 92, 96 }, { 78, 83, 93, 87, 88 } };
		int[] sum = new int[3];
		
		double avg = 0;
		int total = 0;
		int count = 0;
		
		// for문을 이용 -> 각 행을 가져와 열을 읽어 sum에 누적해 평균
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum[i] += arr[i][j];
			}
			total += sum[i];
			avg = (double)sum[i] / arr[i].length;
			count += arr[i].length;
			
			System.out.println("arr[" + i + "] - 원소 : " + arr[i].length);
			System.out.println("총점 : " +  sum[i]);
			System.out.println("평균 : " + avg);
		}
		System.out.println(count);

		System.out.println("[전체 통계] - 원소 : " + count);
		System.out.println("총점 : " +  total);
		System.out.println("평균 : " + (avg/count));
	}

}
