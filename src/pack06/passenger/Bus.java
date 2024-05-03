package pack06.passenger;

public class Bus {
	enum AgeRange{
		아동, 청소년, 성인, 노인
	}
	private final int CHILD_COST = 500;
	private final int TEENAGER_COST = 1000;
	private final int ADULT_COST = 2000;
	private final int SENIOR_COST = 1500;
	
	
	private int number = 0;
	// 승객
	private int passengerCount = 0;
	private int money = 0;
	
	private int cost = 0;
	private String msg = "";
	
	public Bus() {}
	public Bus(int _num) {
		this.number = _num;
	}
	
	public void print() {
		System.out.println("[" + number + "번 버스]");
		System.out.println("탑승객 : " + passengerCount + " 수입 : " + money);
	}
	
	public void take(int _money) { // 승객 탑승
		this.money += _money;
		this.passengerCount++;
	}
	
	public void take(Bus.AgeRange _ageRange) { // 승객 탑승
		if (Bus.AgeRange.아동 == _ageRange) {
			cost = CHILD_COST;
			msg = "[버스탑승] 어린이 입니다." + " | 요금 : " + cost;
		} else if (Bus.AgeRange.청소년 == _ageRange) {
			cost = TEENAGER_COST;
			msg = "[버스탑승] 청소년 입니다." + " | 요금 : " + cost;
		} else if (Bus.AgeRange.성인 == _ageRange) {
			cost = ADULT_COST;
			msg = "[버스탑승] 성인 입니다." + " | 요금 : " + cost;
		} else if (Bus.AgeRange.노인 == _ageRange) {
			cost = SENIOR_COST;
			msg = "[버스탑승] 노인 입니다." + " | 요금 : " + cost;
		} else {
			cost = 0;
			msg = "";
		}
		
		this.money += cost;
		this.passengerCount++;
		System.out.println(msg);
	}
	public int getCost(Bus.AgeRange _ageRange) {
		if (Bus.AgeRange.아동 == _ageRange) {
			return CHILD_COST;
		} else if (Bus.AgeRange.청소년 == _ageRange) {
			return TEENAGER_COST;
		} else if (Bus.AgeRange.성인 == _ageRange) {
			return ADULT_COST;
		} else if (Bus.AgeRange.노인 == _ageRange) {
			return SENIOR_COST;
		} else {
			return 0;
		}
	}
	
	
	
}
