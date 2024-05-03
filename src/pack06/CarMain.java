package pack06;

public class CarMain {

	public static void main(String[] args) {
		
		Car car = new Car("현대", "소나타", "흰색", 600, 80);
		car.printInfo();
		
		car.setSpeed(40);
		System.out.println("변경된 속도 : " + car.getSpeed());
		
		
	}

}
