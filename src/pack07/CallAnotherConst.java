package pack07;

public class CallAnotherConst {

	public static void main(String[] args) {
	
		Person2 noName = new Person2();
		System.out.println(noName.name);
		System.out.println(noName.age);
		
		System.out.println("[noName 주소]");
		System.out.println(noName);
		System.out.println(noName.returnSelf());
		
		Person2 p = new Person2();
		System.out.println("[p 주소]");
		System.out.println(p);
		System.out.println(p.returnSelf());
		
		System.out.println("===============");
		
		Person2 person = noName.returnSelf();
		System.out.println("[person 주소] - noName 주소 복사");
		System.out.println(person);
		System.out.println(person.returnSelf());
		
	}

}

class Person2 {
	
	String name = "";
	int age = 0;
	
	public Person2() {
		this("이름", 12);
	}
	public Person2(String _name, int _age) {
		this.name = _name;
		this.age = _age;
	}
	
	public Person2 returnSelf() {
		return this;
	}
	
}