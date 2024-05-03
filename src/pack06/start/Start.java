package pack06.start;

import java.util.Random;

public class Start {

	private int pcNum = 0;
	private int count = 0;
	private String result = "";
	
	public Start() {
		Initialize();
	}
	
	public void Initialize() {
		pcNum = new Random().nextInt(50) + 1; // 1~50
	}
	
	public String check(int _num) {
		// random값보다 작음 up, 큼 down, 일치 success
		if (_num > pcNum) {
			result = "[DOWN]";
			count++;
		} else if (_num < pcNum) {
			result = "[UP]";
			count++;
		} else {
			result = "[SUCCESS]";
			System.out.println("횟수 : " + count);
		}
		
		return result;
	}
	
}
