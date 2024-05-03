package pack07;

public class Person {
	
	public String name = "";
	public float height = 0.0f;
	public float weight = 0.0f;
	
	public Person() {}
	public Person(String _name) {
		this.name = _name;
	}
	public Person(String _name, float _height, float _weight) {
		this.name = _name;
		this.height = _height;
		this.weight = _weight;
	}
	
}

class Person1 {
	
	public String name;
	public float height;
	public float weight;
	
	public Person1() {
		this.name = "";
		this.height = 0.0f;
		this.weight = 0.0f;
	}
}

