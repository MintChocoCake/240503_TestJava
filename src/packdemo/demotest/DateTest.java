package packdemo.demotest;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy년 MM월 dd일");
		SimpleDateFormat sdf3 = new SimpleDateFormat();
	
		// Date
		Date nowDate1 = new Date();
		Date nowDate2 = new Date();
		Date nowDate3 = new Date();
		
		sdf1.format(nowDate1);
		sdf2.format(nowDate2);
		sdf3.format(nowDate3);
		
		String strDate01 = nowDate1.toString();
		String strDate02 = nowDate2.toString();
		String strDate03 = nowDate2.toString();
		
		System.out.println("Date01 : " + strDate01);
		System.out.println("Date02 : " + strDate02);
		System.out.println("Date03 : " + strDate03);
		
		System.out.println("===============");
		
		// Calendar - abstract로 되어 있음 new 사용 불가.
		Calendar calendar = Calendar.getInstance();
		
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH) + 1;
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		int week = calendar.get(Calendar.DAY_OF_WEEK);
		int amPm = calendar.get(Calendar.AM_PM);
		int hour = calendar.get(Calendar.HOUR);
		int minute = calendar.get(Calendar.MINUTE);
		int second = calendar.get(Calendar.SECOND);
		
		System.out.println("[year : " + year + "] [month :  " + month + "] [ day : " + day + "] [week : " + week + "]");
		System.out.println("[amPm : " + amPm + "] [hour :  " + hour + "] [minute : " + minute + "] [second : " + second + "]");
		
		System.out.println();
		
		String strCal01 = sdf1.format(calendar.getTime());
		String strCal02 = sdf2.format(calendar.getTime());
		
		System.out.println("strCal01 : " + strCal01);
		System.out.println("strCal02 : " + strCal02);
		
		System.out.println("===============");
		
		String strSys01 = sdf1.format(System.currentTimeMillis());
		String strSys02 = sdf2.format(System.currentTimeMillis());
		
		System.out.println("strSys01 : " + strSys01);
		System.out.println("strSys02 : " + strSys02);
		
	}

}
