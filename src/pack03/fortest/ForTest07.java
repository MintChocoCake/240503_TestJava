package pack03.fortest;

public class ForTest07 {

	public static void main(String[] args) {
		
		for (int i = 1; i < 10; i++) {
			System.out.println("=====[" + i + "]=====");
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " x " + j + " = " + (i * j));
			}
		}
		
		System.out.println("===============");
		int height = 11;
		int width = 1;

		boolean transform = true;

		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				System.out.print(" * ");
			}
			System.out.println();
			
			if (5 < width) {
				transform = false;
			}
			
			if (!transform) {
				width--;
			} else {
				width++;
			}
			
		}

	}

}
