package pack07;

public class CarMain {

	public static void main(String[] args) {

		Car myCar= new Car("검정",3000);

		System.out.println("color : "+myCar.getColor());
		System.out.println("cc : "+myCar.getCc());

	}

}

class Car {
	
	private String color = "";
	private int cc = 0;
	
	public Car() {} 
	public Car(String _color, int _cc) {
		this.color = _color;
		this.cc = _cc;
	} 
	
	public String getColor() { return this.color; }
	public int getCc() { return this.cc; }
}
