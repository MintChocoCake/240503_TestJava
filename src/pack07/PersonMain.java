package pack07;

public class PersonMain {

	public static void main(String[] args) {

		Person p1 = new Person();
		System.out.println("이름 : " + (p1.name = "유신"));
		System.out.println("Height : " + (p1.height = 180.0f));
		System.out.println("Weight : " + (p1.weight = 80.0f));

		System.out.println("===============");

		Person p2 = new Person("감찬");
		System.out.println("이름 : " + p2.name);
		System.out.println("Height : " + (p2.height = 180.0f));
		System.out.println("Weight : " + (p2.weight = 80.0f));

		System.out.println("===============");

		Person p3 = new Person("순신", 180.0f, 80.0f);
		System.out.println("이름 : " + p3.name);
		System.out.println("Height : " + p3.height);
		System.out.println("Weight : " + p3.weight);

	}

}
