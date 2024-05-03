package pack06.cafe;

public class BuyCoffeMain {

	public static void main(String[] args) {
		
		// 고객 2명 생성 
		Customer customer1 = new Customer("김복순", 12000);
		Customer customer2 = new Customer("박대기", 10000);
		
		// 카페 생성
		Cafe cafe = new Cafe("힘이나는 커피");
		
		customer1.visitCafe(cafe, 4000);
		customer2.visitCafe(cafe, 4500);
		
		cafe.print();
		
		customer1.print();
		customer2.print();

		
	} // main

} // class
