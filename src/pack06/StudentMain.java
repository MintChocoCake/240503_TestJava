package pack06;

public class StudentMain {

	public static void main(String[] args) {
		
		Student student1 = new Student();
		
		student1.setId(1212);
		student1.setName("모코코");
		student1.setGrade(1);
		student1.setAddress("아크라시아");
		
		Student student2 = new Student(2424, "코코모", 2, "베른");
		
		student1.printInfo();
		student2.printInfo();
		
	}

}
