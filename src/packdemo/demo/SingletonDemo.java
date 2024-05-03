package packdemo.demo;

public class SingletonDemo {

	private static SingletonDemo instance;
	
	private String name;
	private String address;
	
	private SingletonDemo() {}
	
	public static SingletonDemo getInstance() {
		if (null == instance) {
			instance = new SingletonDemo();
		}
		return instance;
	}
	
	// set
	public void setName(String _name) {
		this.name = _name;
	}
	public void setAddress(String _address) {
		this.address = _address;
	}
	// get
	public String getName() {
		return this.name;
	}
	public String getAddress() {
		return this.address;
	}

}
