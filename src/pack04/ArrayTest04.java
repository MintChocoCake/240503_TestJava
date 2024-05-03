package pack04;

public class ArrayTest04 {

	public static void main(String[] args) {
		
		double[] data = new double[5];
		double total = 0.0;
		
		data[0] = 10.0;
		data[1] = 20.0;
		data[2] = 30.0;

		for (int i = 0; i < 3; i++) {
			total += data[i];
		}
		
		System.out.println("total : " + total);
		
	}

}
