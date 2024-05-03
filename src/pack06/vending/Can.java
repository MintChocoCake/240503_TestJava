package pack06.vending;

public class Can {
	
	private String name = "";
	private int price = 0;
	
	public Can() {}
	public Can(String _name, int _price) {
		this.name = _name;
		this.price  = _price;
	}
	
	public void print() {
		System.out.println("[" + this.name + " - " + this.price + "]");
	}
	
	public void setName(String _name) { this.name = _name; }
	public void setPrice(int _price) { this.price = _price; }
	
	public String getName() { return this.name; }
	public int getPrice() { return this.price; }
	
}
