package packdemo.demotest;

public class OverRidingTest {

	public static void main(String[] args) {

		Person people1 = new Person();
		Person people2 = new Chiled();

		people1.cry();
		people2.cry();

		people1.setAge(30);
		people2.setAge(35);

		System.out.println("p1 age : " + people1.getAge());
		System.out.println("p2 age : " + people2.getAge());

		Chiled chiled = new Chiled();
		chiled.printAge();

		System.out.println("===============");

		InterfaceExam interTest = new InterfaceExam();
		interTest.fun1();
		
	} // main
} // class

class Person {
	protected int age = 0;

	public void setAge(int _age) {
		this.age = _age;
	}

	public int getAge() {
		return this.age;
	}

	protected void cry() {
		System.out.println("따흑");
	}

}

// extends : 클래스와 클래스 및 추상 클래스의 상속에 사용
// implements : Interface 상속에 사용 

// extends : 상속 - 클래스 확장
class Chiled extends Person {
	protected void cry() {
		System.out.println("응애");
	}

	public void printAge() {
		System.out.println("Chiled printAge");
		System.out.println(this.age);
		super.cry();
	}
}

// interface 는 메서드를 정의만 하는게 가능
interface TestInterface {
	public static int num = 8;

	public void fun1();

	public void fun2();
}

// implements : 인터페이스 구현
// 부모 메서드를 반드시 오버라이딩 해야됨. (다중상속을 대신해줌)
class InterfaceExam implements TestInterface {
	public void fun1() {
		System.out.println("TestInterface num : " + num);
	}

	public void fun2() {

	}
}
