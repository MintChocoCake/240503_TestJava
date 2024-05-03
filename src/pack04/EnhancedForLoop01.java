package pack04;

public class EnhancedForLoop01 {

	public static void main(String[] args) {
		
		String[] strAry = { "Java", "Oracle", "HTML5", "CSS", "JSP", "Spring", "Python" };
		
		for (int i = 0; i < strAry.length; i++) {
			System.out.print(strAry[i] + " ");
		}
		System.out.println();

		for (String str : strAry) {
			System.out.print(str + " ");
		}
		System.out.println();
		
	}
}
