package pack06.cafe;

public class Cafe {
	
	private String name = "";
	private int money = 0;
	
	public Cafe(String _name) {
		this.name = _name;
	}
	
	public void sell(int _payMoney) {
		System.out.println("[" + this.name + " 방문 - 사용금액 : " + _payMoney + "]");
		this.money += _payMoney;
	}
	
	public void print() {
		System.out.println("[" + this.name + " 매출 : " + this.money + "]");
	}
	
	public String getName() { return this.name; }
	public int getMoney() { return this.money; }
	
}
