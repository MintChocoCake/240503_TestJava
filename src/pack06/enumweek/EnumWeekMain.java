package pack06.enumweek;

import java.util.Calendar;

public class EnumWeekMain {

	public static void main(String[] args) {
		
		Week today = null;
		Calendar cal = Calendar.getInstance();
		
		int week = cal.get(Calendar.DAY_OF_WEEK); // 1~7
		String msg = "";
		
		switch (week) {
		case 1:
			today = Week.SUNDAY;
			//msg = "늦잠을 잔다.";
			break;		
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.TUSEDAY;
			break;
		case 4:
			today = Week.WEDNESDAY;
			break;
		case 5:
			today = Week.THURSDAY;
			break;
		case 6:
			today = Week.FRIDAY;
			break;
		case 7:
			today = Week.SATURDAY;
			break;
		default:
			break;
		} // swich
		
		System.out.println("요일 : " +  today);
		System.out.println(cal.get(Calendar.YEAR));
		
		if (Week.SUNDAY == today) {
			msg = "늦잠";
		} else {
			msg = "공부";
		}
		System.out.println(msg);
		
	} // main

} // class
