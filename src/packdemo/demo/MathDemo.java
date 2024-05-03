package packdemo.demo;

import java.util.Random;

public class MathDemo {

	public void testFuntion() {
		System.out.println("Is MathDemo testFuntion");
	}
	
	public static void main(String[] args) {
		
		// Math.random() : 0~1 (1 미포함) 구간에서 부동소수점 난수 생성
		// 랜덤 난수 생성 2가지
		// #1 Random 클래스 이용 Random.nextInt(설정할 랜덤 범위)
		Random ran = new Random();
		int ranNum1 = ran.nextInt(100); 
		
		// #2 Math 클래스의 random() 매서드 - (Math.random() * 뒷 범위 + 앞 범위)
		int ranMax = 100;
		int ranMin = -30;
		
		// ranMin ~ (ranMax + ranMin) 범위의 난수 발생
		int ranNum2 = (int)(Math.random() * ranMax + ranMin);
		
		for (int i = 0; i < 1; i++) {
			System.out.println("=====[Random " + i + "]=====");
			ranNum1 = ran.nextInt(100);
			ranNum2 = (int)(Math.random() * ranMax + ranMin);
			
			System.out.println("Random : " + ranNum1);
			System.out.println("Math.Random : " + ranNum2);
		}
		
		System.out.println("====================");
		
		// Math.ceil(double) : 올림
		System.out.println("올림 10.0 : " + Math.ceil(10.0));
		System.out.println("올림 10.1 : " + Math.ceil(10.1));
		System.out.println("올림 10.0001 : " + Math.ceil(10.0001));
		// Math.floor(double) : 내림 - 소수점 1째자리 이후 숫자를 버리고, 정수 리턴
		System.out.println("내림 10.0 : " + Math.floor(10.0));
		System.out.println("내림 10.9 : " + Math.floor(10.9));
		// Math.round(double) : 반올림
		System.out.println("반올림 10.0 : " + Math.round(10.0));
		System.out.println("반올림 10.4 : " + Math.round(10.4));
		System.out.println("반올림 10.5 : " + Math.round(10.5));
		
		System.out.println("====================");
		// Min Max
		System.out.println("Min 1.0, 1.2 : " + Math.min(1.0, 1.2));
		System.out.println("Max 1.0, 1.2  : " + Math.max(1.0, 1.2));
		
		System.out.println("====================");
		// 제곱(pow), 제곱근(sqrt)
		double a = 5.0, b = 2.0, c = 100.0; 
		System.out.println("a의 b제곱 : " + Math.pow(a, b));
		System.out.println("c 제곱근 : " + Math.sqrt(c));
		
		
	}

}
