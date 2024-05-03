package pack06.passenger;

public class PassengerInfo {
	
	private String name = "";
	private int money = 0;
	
	public PassengerInfo() {}
	public PassengerInfo(String _name, int _money) {
		this.name = _name;
		this.money = _money;
	}
	
	public void print() {
		System.out.println("[이름 : " + this.name + " | 소지금 : " + money + "]");
	}
	
	public void takeBus(Bus _bus, Bus.AgeRange _agerange) {
		if (_bus.getCost(_agerange) > this.money) {
			System.out.println("[버스] 잔액이 부족합니다.");
			return;
		}
		
		_bus.take(_agerange);
		this.money -= _bus.getCost(_agerange);
	}
	
	public void takeSubway(Subway _sub, Subway.AgeRange _agerange) {
		if (_sub.getCost(_agerange) > this.money) {
			System.out.println("[지하철] 잔액이 부족합니다.");
			return;
		}
		
		_sub.take(_agerange);
		this.money -= _sub.getCost(_agerange);
	}
	
	// get / set
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	
}
