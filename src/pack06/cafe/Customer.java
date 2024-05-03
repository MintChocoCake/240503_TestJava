package pack06.cafe;

public class Customer {
	
	private String name = "";
	public int money = 0;
	
	public Customer(String _name, int _money) {
		this.name = _name;
		this.money = _money;
	}
	
	public void visitCafe(Cafe _cafe, int _paymoney) {
		if (_paymoney > this.money) {
			System.out.println("[" + this.name + " : 잔액 부족]");
			return;
		}
		
		_cafe.sell(_paymoney);
		this.money -= _paymoney;
		print();
	}
	
	public void print() {
		System.out.println("[" + this.name + " 님 잔액 : " + this.money + "]");
	}
	
	
}
