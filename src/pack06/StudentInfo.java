package pack06;

public class StudentInfo {
	
	private int id = 0;
	private String name = "";
	private int grade = 0;
	private String address = "";
	
	
	public StudentInfo() {
		System.out.println("기본 생성자");
		initialize();
	}
	public StudentInfo(int _id, String _name, int _grade, String _address) {
		this.id = _id;
		this.name = _name;
		this.grade = _grade;
		this.address = _address;
	}
	
	public void initialize() {
		System.out.println("이니셜라이즈");
		this.id = 234;
		this.name = "이나영";
		this.grade = 2;
		this.address = "경기";
	}
	
	public void printInfo() {
		System.out.println(this.id);
		System.out.println(this.name);
		System.out.println(this.grade);
		System.out.println(this.address);
	}
	
}
