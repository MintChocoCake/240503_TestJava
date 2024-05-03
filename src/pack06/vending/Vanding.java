package pack06.vending;

public class Vanding {

	private Can[] cans = null;
	private int money = 0;
	private int max = 0;

	private int count = 0;

	public Vanding() {
		Initialize();
	}

	public Vanding(int _Count) {
		max = _Count;
		cans = new Can[_Count];
	}

	public void Initialize() {
		count = 6;
		cans = new Can[6];

		cans[0] = new Can("콜라", 2000);
		cans[1] = new Can("사이다", 3000);
		cans[2] = new Can("환타", 2500);
		cans[3] = new Can("매실", 1500);
		cans[4] = new Can("물", 1000);
		cans[5] = new Can("맥주", 5000);
	}

	// 매게변수 생성자를 사용할 경우.
	public void addCan(String _name, int _money) {
		if (max <= count) {
			System.out.println("자판기가 꽉 찼습니다.");
			return;
		}
		cans[count++] = new Can(_name, _money);
	}

	public void printCan() {
		System.out.println("등록된 캔 개수 : " + count + " / " + cans.length);
		for (int i = 0; i < cans.length; i++) {
			System.out.print(i + ". ");
			cans[i].print();
		}
	}

	public void showCanMenu(int _money) {
		System.out.println("등록된 캔 개수 : " + count + " / " + cans.length);
		for (int i = 0; i < cans.length; i++) {
			if (cans[i].getPrice() <= _money) {
				System.out.print(i + ". [구매 가능 O] ");
				cans[i].print();
			} else {
				System.out.print(i + ". [잔액 부족 X] ");
				cans[i].print();
			}

		}
	}

	public Can getCan(int _num) {
		if (0 > _num || cans.length <= _num) {
			return null;
		}

		return cans[_num];
	}

	public int buyCan(int _num, int _money) {
		if (0 > _num || cans.length <= _num) {
			System.out.println("잘못된 번호");
			return _money;
		}
		if (this.cans[_num].getPrice() > _money) {
			System.out.println("잔액 부족");
			return _money;
		}

		System.out.println("[" + this.cans[_num].getName() + "(" + 
				this.cans[_num].getPrice() + " 원) 구매완료]");
		
		int balance = _money - this.cans[_num].getPrice();
		System.out.println("[잔액 : " + balance + "]");

		return balance;
	}

}
