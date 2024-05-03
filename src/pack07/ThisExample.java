package pack07;

public class ThisExample {
	
	private int year;
	private int month;
	private int day;
	
	public ThisExample() {
		Initialize(0, 0, 0);
	}
	public ThisExample(int _year, int _month, int _day) {
		Initialize(_year, _month, _day);
	}
	
	public void Initialize(int _year, int _month, int _day) {
		this.year = _year;
		this.month = _month;
		this.day = _day;
	}
	
	public void print() {
		System.out.println(this.year + "년 " + this.month + "월 " + this.day + "일");
	}
 	
	// get set
	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}

	public static void main(String[] args) {
		
		ThisExample te1 = new ThisExample(2024, 3, 7);
		te1.print();
		
		ThisExample te2 = new ThisExample();
		te2.Initialize(2024, 8, 14);
		te2.print();
		
		
		
	}
	
}
