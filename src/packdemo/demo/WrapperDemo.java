package packdemo.demo;

public class WrapperDemo {

	public static void main(String[] args) {
		
		Integer num = 17; // 오토 박싱 (기본타입 -> 객체)
		int n = num; // 오토 언박싱 (객체 -> 기본타입)
		System.out.println("n : " + n);
		
		String str = "10";
		int i = Integer.parseInt(str);
		System.out.println("i : " + i);
		
		Integer num1 = new Integer(10);
		int num2 = 10;
		Integer num3 = new Integer(10);
		
		// 컴파일러가 자동으로 오토박싱 과 언박싱을 수행해줌 -> 객체와 기본자료형 비교 가능
		System.out.println("래퍼 == 기본 : " + (num1 == num2));
		System.out.println("래퍼.equals(기본) : " + num1.equals(num2));
		// == 연산은 래퍼 객체의 내부값이 아닌 참조 주소를 비교하기 때문에 결과가 false
		System.out.println("래퍼 == 래퍼 : " + (num1 == num3));
		// equals 은 내부의 값을 얻어 비교함 -> 객체 끼리의 비교는 equals 를 사용해야됨
		System.out.println("래퍼.equals(래퍼) : " + num1.equals(num3));
		
	}

}
