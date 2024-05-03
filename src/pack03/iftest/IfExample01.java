package pack03.iftest;

public class IfExample01 {
	
	public static void main(String[] args) {
		
		int age = 5;
		
		if (age >= 5) {
			System.out.println("학교에 다닙니다.");
		} else {
			System.out.println("학교에 안 다닙니다.");
		}
		
		switch (age) {
		case 0: 
		case 1:
		case 2:
		case 3:
		case 4: {
			System.out.println("학교에 안 다닙니다.");
			break;
		}
		
		default:
			System.out.println("학교에 다닙니다.");
			break;
		}
		
		
	}
}
