package pack06;

public class Student {
	
	public int id = 0;
	public String name = "";
	public int grade = 0;
	public String address = "";
	
	public Student() {}
	
	public Student(int _id, String _name, int _grade, String _address) {
		this.id = _id;
		this.name = _name;
		this.grade = _grade;
		this.address = _address;
	}
	
	public void printInfo() {
		System.out.println("ID :  " + this.id);
		System.out.println("Name :  " + this.name);
		System.out.println("Grade :  " + this.grade);
		System.out.println("Address :  " + this.address);
	}

	// get set
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
}
