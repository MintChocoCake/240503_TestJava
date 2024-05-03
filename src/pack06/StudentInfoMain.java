package pack06;

import java.time.LocalDate;

public class StudentInfoMain {

	public static void main(String[] args) {
		
		StudentInfo stuInfo = new StudentInfo(11, "김똘똘", 1, "서울");
		stuInfo.printInfo();
		
		StudentInfo stuInfo2 = new StudentInfo();
		stuInfo2.printInfo();
	
		System.out.println("==========");
		
		LocalDate today = LocalDate.now();
		System.out.println(today.getYear() + "년 | " + today.getMonthValue() + "월 - " 
		+ today.getMonth() + " | " + today.getDayOfMonth() + "일");
		System.out.println(today.getDayOfWeek());
		
		System.out.println("==========");
		

		
	}

}
