package packdemo.demotest.comparator;

import java.util.Comparator;

public class ComparatorTestMain {

	public static void main(String[] args) {
		
		Student01 stu1 = new Student01(17, 2);
		Student01 stu2 = new Student01(18, 4);
		Student01 stu3 = new Student01(19, 7);
		
		int isBig = stu1.compare(stu2, stu3);
		
		if (0 == isBig) {
			System.out.println("stu2 와 stu3이 같음");
		} else if (0 < isBig) {
			System.out.println("stu2 가 stu3 보다 큼");
		} else {
			System.out.println("stu2 가 stu3 보다 작음");
		}
		
		System.out.println("=====[익명 클래스]=====");
		
		// 익명 클래스 1
		Student01 stu4 = new Student01() {
			int val = 3;
			public int compare(Student01 _o1, Student01 _o2) {
				return (_o1.classNum - _o2.classNum);
			}
			
			public int get() {
				return val;
			}
		};
		
		
		System.out.println("stu4 : " + stu4.get());
		System.out.println("stu5 : " + stu5.get());
		
		
		Comparator<Student01> com1 = new Comparator<Student01>() {
			
			public int compare(Student01 _stu1, Student01 _stu2) {
				return (_stu1.classNum - _stu2.classNum);
			}
		
		};
		
		System.out.println("com1(stu3,4) : " + com1.compare(stu3, stu4));
		System.out.println("com2(stu1,2) : " + com2.compare(stu1, stu2));
		
		// Comparable 은 자기자신과 또하나의 매게변수 비교 (익명클래스로 굳이 임)
		// Comparator 는 매게변수1 과 매게변수2를 비교
		
		
		
		
	} // main
	
	// 익명 클래스 2
	static Student01 stu5 = new Student01() {
		int val = 5;
		
		public int compare(Student01 _o1, Student01 _o2) {
			return (_o1.classNum - _o2.classNum);
		}
		
		public int get() {
			return val;
		}
	};
	
	public static Comparator<Student01> com2 = new Comparator<Student01>() {
		
		public int compare(Student01 _stu1, Student01 _stu2) {
			return (_stu1.classNum - _stu2.classNum);
		}
	};

} // class
