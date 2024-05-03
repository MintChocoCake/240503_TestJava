package pack06.baseball;

import java.util.Random;
import java.util.Scanner;

public class BaseBall {

	private final int MAX_BALL = 3;
	private final int MAX_NUM = 9;

	Scanner sc = null;
	
	private int[] baseBallNums = null;
	// 스트라이크 여부 검사
	private boolean[] strikeCheak = null;
	private int ball = 0;
	// 최종결과가 스트라이크 인것을 알려줌
	private boolean isStrike = false;

	// 회차
	private int maxRound = 0;
	private int curRound = 0;
	private boolean isFinish = false;

	public BaseBall() {
		initialize();
	}

	private void initialize() {
		sc = new Scanner(System.in);
		
		this.baseBallNums = new int[MAX_BALL];
		this.strikeCheak = new boolean[MAX_BALL];
		// 1~9
		resetNum();
		initData();
		resetRound();
	}
	
	// # 최종적으로 제공되는 함수
	public void playGame() {
		inputRound();

		while (true) {
			System.out.println("=====[야구게임]=====");
			printRound();

			System.out.print("1번째 숫자 : ");
			int userNum1 = Integer.parseInt(sc.nextLine());

			System.out.print("2번째 숫자 : ");
			int userNum2 = Integer.parseInt(sc.nextLine());

			System.out.print("3번째 숫자 : ");
			int userNum3 = Integer.parseInt(sc.nextLine());

			if (isFoul(userNum1, userNum2, userNum3)) {
				continue;
			}

			nextRound();

			progress(userNum1, userNum2, userNum3);

			if (isStrike()) {
				System.out.println("=====[3 Strike !]=====");
				printRound();
				printBaseBallNum();
				break;
			}
			
			if (isFinish()) {
				System.out.println("=====[라운드 초과 !]=====");
				printRound();
				printBaseBallNum();
				break;
			}

		} // while
		
		Free();
	}

	// # Round
	private void resetRound() {
		curRound = 0;
		isFinish = false;
	}

	private void nextRound() {
		if (true == isFinish) {
			return;
		}

		curRound++;
		if (maxRound <= curRound) {
			isFinish = true;
		}
	}
	
	public void printRound() {
		System.out.println("[회차 : " + curRound + " / " + maxRound + "]");
	}

	// get set
	public void setMaxRound(int _max) {
		maxRound = _max;
	}
	// 회차수 입력.
	public void inputRound() {
		while (true) {
			System.out.println("=====[야구게임]=====");
			System.out.print("(최소 3회차)회차 입력 : ");
			int round = Integer.parseInt(sc.nextLine());

			if (3 > round) {
				System.out.println("입력 오류.");
				continue;
			}

			setMaxRound(round);
			break;
		} // while
	}

	// 회차종료여부
	public boolean isFinish() {
		return isFinish;
	}

	// # BaseBallNum
	// 랜덤번호 세팅 + 중복체크
	private void resetNum() {
		Random ran = new Random();
		for (int i = 0; i < MAX_BALL; i++) { // 0~9
			baseBallNums[i] = ran.nextInt(MAX_NUM) + 1;
			for (int j = 0; j < i; j++) { // 중복체크
				if (baseBallNums[i] == baseBallNums[j]) {
					i--;
					continue;
				}
			} // for j
		} // for i
	}

	// strikeCheak[], isStrike, ball 초기화
	private void initData() {
		for (int i = 0; i < MAX_BALL; i++) {
			strikeCheak[i] = false;
		}
		isStrike = false;
		ball = 0;
	}

	private void cheakStrike() {
		for (int i = 0; i < MAX_BALL; i++) {
			if (true == strikeCheak[i]) {
				isStrike = true;
			} else {
				isStrike = false;
				return;
			}
		}
	}

	// 입력한숫자와 해당 인덱스 번호의 숫자 검사
	private void cheakNum(int _index, int _num) {
		if (0 > _index || MAX_BALL <= _index) {
			System.out.println("cheakNum : Index Error");
			return;
		}

		for (int i = 0; i < MAX_BALL; i++) {
			if (_index == i) { // _index 번쨰의 숫자일 때 -> strike 조건
				if (_num == baseBallNums[i]) {
					strikeCheak[_index] = true;
				}
			} else { // 아닐 때 -> ball 조건
				if (_num == baseBallNums[i]) {
					ball++;
				}
			}
		} // for
	}

	// 스트라이크/볼 검사 -> 결과 정산
	public void progress(int _num1, int _num2, int _num3) {
		// 초기화
		initData();

		// 스트라이크/볼 검사
		cheakNum(0, _num1);
		cheakNum(1, _num2);
		cheakNum(2, _num3);

		// 스트라이크 여부 검사
		cheakStrike();

		// 결과 출력
		printResult();
	}

	// 결과
	public boolean isStrike() {
		return this.isStrike;
	}

	public int getBall() {
		return this.ball;
	}

	public void printBaseBallNum() {
		for (int i = 0; i < MAX_BALL; i++) {
			System.out.println("[num " + (i + 1) + " : " + baseBallNums[i] + "]");
		}
		System.out.println();
	}

	public void printResult() {
		int strikeCount = 0;
		for (int i = 0; i < MAX_BALL; i++) {
			if (true == strikeCheak[i]) {
				strikeCount++;
			}
		}
		System.out.println("=====[결과]=====");
		// 번호 출력
		printBaseBallNum();
		System.out.println("BallCount : " + ball);
		System.out.println("StrikeCount : " + strikeCount);
		// System.out.println("Is Strike ? : " + isStrike);
	}

	// #유저가 입력한 숫자 검사 (범위초과, 중복)
	public boolean isFoul(int _num1, int _num2, int _num3) {
		if (0 > _num1 || MAX_NUM < _num1 || 0 > _num2 || MAX_NUM < _num2 || 0 > _num3 || MAX_NUM < _num3) {
			System.out.println("잘못된 숫자 범위 입력.");
			return true;
		}
		// return false;

		if (_num1 == _num2) {
			System.out.println("중복 숫자 입력.");
			return true;
		} else if (_num1 == _num3) {
			System.out.println("중복 숫자 입력.");
			return true;
		} else if (_num2 == _num3) {
			System.out.println("중복 숫자 입력.");
			return true;
		}

		return false;
	}
	
	public void Free() {
		sc.close();
	}
	

} // class