package pack02;

import java.util.Scanner;

public class Example06 {

	boolean isSunny = true;
	boolean isWarm = true;
	boolean isWeatherResult = true;
	
	public void IsSunny(Scanner _sc) {
		System.out.print("날씨가 화창 한가요 ? (true/false) : ");
		isSunny = _sc.nextBoolean();
	}
	public void IsWarm(Scanner _sc) {
		System.out.print("날씨가 따뜻 한가요 ? (true/false) : ");
		isWarm = _sc.nextBoolean();
	}
	public void weatherResult() {
		isWeatherResult = (isSunny && isWarm) ? true : false;
		System.out.println("날씨가 화창하면서 따뜻한가요? : " + isWeatherResult);
	}
	
	public static void main(String[] args) {
		// Scanner 사용 두개의 불 변수를 입력받아 날씨가 화창하면서 따듯한지 여부를 출력

		Example06 example = new Example06();
		
		try(Scanner sc = new Scanner(System.in)) {
			example.IsSunny(sc);
			example.IsWarm(sc);
			
			example.weatherResult();
		}
		
	}

}
