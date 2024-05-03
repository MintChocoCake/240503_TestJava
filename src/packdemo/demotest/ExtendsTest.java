package packdemo.demotest;

class People {
	protected String name = "";
	protected int age = 0;
	
	protected void printInfo() {
		System.out.println("=====[People.printInfo]=====");
		System.out.println("[이름 : " + name + "]");
		System.out.println("[나이 : " + age + "]");
	}
	
}

class Student extends People {
	private int korScore = 0;
	private int mathScore = 0;
	private int engScore = 0;
	
	public Student(String _name, int _age, int _kor, int _math, int _eng) {
		this.name = _name;
		this.age = _age;
		this.korScore = _kor;
		this.mathScore = _math;
		this.engScore = _eng;
	}
	
	public void printInfo2() {
		System.out.println("=====[Student.printInfo]=====");
		System.out.println("[Name : " + this.name + "]");
		System.out.println("[Age : " + this.age + "]");
		System.out.println("[Kor : " + this.korScore + "]");
		System.out.println("[Math : " + this.mathScore + "]");
		System.out.println("[Eng : " + this.engScore + "]");
	}
	
}

public class ExtendsTest {

	public static void main(String[] args) {
		Student stu = new Student("모코코", 18, 79, 82, 64);
		
		stu.printInfo();
		stu.printInfo2();
		
	}

}
