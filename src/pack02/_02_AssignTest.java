package pack02;

public class _02_AssignTest {

	public static void main(String[] args) {
		// 전위연산
		System.out.println("=====[전위연산]=====");
		int gameScore = 150;
		int lastScore1 = ++gameScore;
		System.out.println(lastScore1);
		
		int lastScore2 = --gameScore;
		System.out.println(lastScore2);
		
		// 후위연산
		System.out.println("=====[후위연산]=====");

		int lastScore3 = gameScore++;
		System.out.println(lastScore1);
		
		int lastScore4 = gameScore--;
		System.out.println(lastScore2);
		
	}

}
