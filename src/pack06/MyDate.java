package pack06;

public class MyDate {
	
	private int year = 0;
	private int month = 0;
	private int day = 0;
	
	public MyDate() {}
	
	public MyDate(int _year, int _month, int _day) {
		this.year = _year;
		this.month = _month;
		this.day = _day;
	}
	
	public void printDate() {
		System.out.println(this.year + "년 " + this.month + "월 " + this.day + "일");
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}
	
	
	
}
