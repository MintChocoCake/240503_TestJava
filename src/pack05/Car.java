package pack05;

public class Car {

	public String carName = "";
	public String carColor = "";
	public int carNum = 0;
	
	public Car(String _name, String _color, int _num) {
		this.carName = _name;
		this.carColor = _color;
		this.carNum = _num;
	}
	
	public void showInfo() {
		System.out.println(this.carName + ", " + this.carColor + ", " + this.carNum);
	}
	
	public void setCarName(String _name) {
		this.carName = _name;
	}
	public void setCarColor(String _color) {
		this.carColor = _color;
	}
	
	public String getCarName() {
		return this.carName;
	}
	public String getCarColor() {
		return this.carColor;
	}
	
} // Car
