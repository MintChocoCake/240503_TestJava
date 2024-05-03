package pack04;

public class ArrayTest06 {

	public static void main(String[] args) {
		
		char[] alpa = new char[26];
		char ch = 'A';
		
		for (int i = 0; i < alpa.length; i++) {
			alpa[i] = ch++;
			
			System.out.print("[" + alpa[i] + ", " + (int)alpa[i] + "] ");
			
			if (0 == ((i+1) % 7))
				System.out.println();
		}
		
	}

}
