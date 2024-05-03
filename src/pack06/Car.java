package pack06;

public class Car {
	
	public String companey = "기아";
	public String model = "소나타";
	public String color = "흰색";
	
	public int maxSpeed = 350;
	public int speed = 0;
	
	public Car() {}
	
	public Car(String _companey, String _model, String _color, int _maxSpeed, int _speed) {
		this.companey = _companey;
		this.model = _model;
		this.color = _color;
		this.maxSpeed = _maxSpeed;
		this.speed = _speed;
	}

	public void printInfo() {
		System.out.println("제조사 : " + this.companey);
		System.out.println("모델명 : " + this.model);
		System.out.println("색상 : " + this.color);
		System.out.println("최고속력 : " + this.maxSpeed);
		System.out.println("속력 : " + this.speed);
	}
	
	public String getCompaney() {
		return companey;
	}

	public void setCompaney(String companey) {
		this.companey = companey;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
 	

	
}
