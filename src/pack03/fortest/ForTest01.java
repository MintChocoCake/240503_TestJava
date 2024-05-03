package pack03.fortest;

public class ForTest01 {

	public static void main(String[] args) {
		System.out.println("1부터 100까지 합 출력");
		
		int i;
		int num = 0;
		
		for (i = 0; i < 100; i++) {
			num += i;
		}
		
		System.out.println("합 : " + num);

	}

}
