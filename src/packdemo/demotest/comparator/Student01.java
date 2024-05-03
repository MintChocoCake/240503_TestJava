package packdemo.demotest.comparator;

import java.util.Comparator;

public class Student01 implements Comparator<Student01> {

	public int age;
	public int classNum;
	
	int val = 1;
	
	public Student01() {}
	public Student01(int _age, int _classNum) {
		this.age = _age;
		this.classNum = _classNum;
	}
	
	public int compare(Student01 _o1, Student01 _o2) {
		return (_o1.classNum - _o2.classNum);
	}
	
	public int get() {
		return val;
	}
	
	public void testPrint01() {
		System.out.println("Student test Print01");
	}
	
}
