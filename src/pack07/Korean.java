package pack07;

public class Korean {
	
	String name = "";
	// 국적
	String nation = "";
	// 전화번호
	String ssn = "";
	
	public Korean() {}
	public Korean(String _name, String _ssn) {
		this.name = _name;
		this.ssn = _ssn;
		this.nation = "한국";
	}
}
