package packdemo.demotest;

import java.util.Vector;

public class Student01Test {

	private String name = "";
	private int id = 0;
	private int age = 0;
	private String address = "";
	
	public void SetInfo(String _name, int _id, int _age, String _address) {
		name = _name;
		id = _id;
		age = _age;
		address = _address;
	}
	
	public void PrintInfo() {
		System.out.println("=====[Info]=====");
		System.out.println("Name : " + name);
		System.out.println("ID : " + id);
		System.out.println("Age : " + age);
		System.out.println("Address : " + address);
	}
	
	public  void FixName(String _name) {
		name = _name;
	}
	public  void FixID(int _id) {
		id = _id;
	}
	public  void FixAge(int _age) {
		age = _age;
	}
	public  void FixAddress(String _address) {
		address = _address;
	}

	// 자바엔 구조체가 없음 -> class 를 구조체처럼 사용?
	public class Score {
		int math;
		int eng;
		int science;
		
		int total;
		double average;
	}
	private Score score = new Score();
	
	public void SetScore(Score _score) {
		score = _score;
		
		score.total = score.math + score.eng + score.science;
		score.average = score.total / 3;
	}
	public void SetScore(int _math, int _eng, int _science) {
		score.math = _math;
		score.eng = _eng;
		score.science = _science;
		
		score.total = _math + _eng + _science;
		score.average = score.total / 3;
	}
	
	public void PrintALLScore() {
		System.out.println("=====[Score]=====");
		System.out.println("Math : " + score.math);
		System.out.println("Eng : " + score.eng);
		System.out.println("Science : " + score.science);
		System.out.println("Total : " + score.total);
		System.out.println("Average : " + score.average);
	} 
	public void PrintScore() {
		System.out.println("Math : " + score.math);
		System.out.println("Eng : " + score.eng);
		System.out.println("Science : " + score.science);
	} 
	public void PrintTotal() {
		System.out.println("Total : " + score.total);
	}
	public void PrintAverage() {
		System.out.println("Average : " + score.average);
	}
	
	public static void main(String[] args) {
		Student01Test student = new Student01Test();
		
		// Vector 할당시 기본 할당 크기 10
		Vector<Student01Test> StudentList = new Vector<Student01Test>(5);
		
		int stucount = 2;
		
		String name = "Mococo ";
		int id = 1;
		int age = 21;
		String address = "Lost ";
		
		int math = 25;
		int eng = 34;
		int science = 42;
		
		for (int i = 0; i < stucount; i++) {
			Student01Test stu = new Student01Test();
			stu.SetInfo(name + i, id++, age + i, address + i);
			stu.SetScore(math + (i* 10), eng + (i* 3), science + (i* 5));
			StudentList.add(stu);
		}
		
		for (int i = 0; i < StudentList.size(); i++) {
			StudentList.get(i).PrintInfo();
			StudentList.get(i).PrintALLScore();
		}
		
		System.out.println("SL Size : " + StudentList.size());
		
		// trimToSize : 저장된 요소 만큼 크기를 줄임 
		//StudentList.trimToSize();
		
		System.out.println("SL Capacity : " + StudentList.capacity());
				
		System.out.println("====================");
		
	}

}
