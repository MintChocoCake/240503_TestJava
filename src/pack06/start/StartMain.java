package pack06.start;

import java.util.Scanner;

public class StartMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Start st = new Start();
		
		while (true) {
			System.out.print("숫자 : ");
			int inputNum = Integer.parseInt(sc.nextLine());
			
			String check = st.check(inputNum);
			System.out.println(check);
			if (check.equals("[SUCCESS]")) {
				break;
			}
		}
		
		
		sc.close();
		
	} // main

} // class
