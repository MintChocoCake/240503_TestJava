package pack05;

public class Example03 {

	public double caculatorAverage(int[] _arr) {
		int total = 0;
		
		for (int i : _arr) {
			total += i;
		}
		
		return (double)total / _arr.length;
	}
	
	public static void main(String[] args) {
		
		Example03 caculator = new Example03();
		
		int[] numArr = { 5, 10, 15, 20, 25 };
		
		double avg = caculator.caculatorAverage(numArr);
		System.out.println("평균 : " + avg);
		
	}

}
