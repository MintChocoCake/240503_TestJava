package pack04;

import java.util.Scanner;

public class Example04 {

	public static void main(String[] args) {
		// 학생수를 입력, 점수 입력 후 점수 리스트 출력 후 총점과 평균을 분석
		Scanner sc = new Scanner(System.in);
		
		boolean run = true;
		int inputNum = 0;
		
		int studentCount = 0;
		int[] scoreArr = null;
		
		int studentNum = 0;
		
		while (run) {
			System.out.println("=====[메뉴]=====");
			System.out.println("[1]학생수입력 [2]점수입력 [3]점수리스트 [4]분석 [0]종료");
			System.out.print("입력 : ");
			inputNum = Integer.parseInt(sc.nextLine());
			
			switch (inputNum) {
			case 0: 
				System.out.println("종료.");
				run = false;
				break;
				
			case 1:
				System.out.print("학생 수 : ");
				studentCount = Integer.parseInt(sc.nextLine());
				scoreArr = new int[studentCount];
				break;
				
			case 2:
				if (0 >= studentCount || 0 >= scoreArr.length) {
					System.out.println("학생수를 먼저 입력하세요.");
					break;
				}
				
				while (true) {
					System.out.println("[점수리스트]");
					for (int i = 0; i < scoreArr.length; i++) {
						System.out.println("[" + i + "] " + scoreArr[i]);
					}
					System.out.print("(메뉴 : -1) 점수를 입력할 학생 번호 : ");
					studentNum = Integer.parseInt(sc.nextLine());
					if (-1 == studentNum) {
						studentNum = 0;
						break;
					} else if (0 > studentNum || scoreArr.length <= studentNum) {
						System.out.println("잘못된 입력입니다.");
						studentNum = 0;
						continue;
					}
					System.out.print(studentNum + "번 학생 점수 입력 : ");
					scoreArr[studentNum] = Integer.parseInt(sc.nextLine());
				}
				break;
				
			case 3:
				if (0 >= studentCount || 0 >= scoreArr.length) {
					System.out.println("입력된 학생정보가 없습니다.");
					break;
				}
				System.out.println("[점수리스트]");
				for (int i = 0; i < scoreArr.length; i++) {
					System.out.println("[" + i + "] " + scoreArr[i]);
				}
				break;
				
			case 4:
				if (0 >= studentCount || 0 >= scoreArr.length) {
					System.out.println("입력된 학생정보가 없습니다.");
					break;
				}
				int topScore = 0;
				int topScoreStudentNum = 0;
				int total = 0;
				double avg = 0.0; 
				
				for (int i = 0; i < scoreArr.length; i++) {
					if (topScore < scoreArr[i]) {
						topScore = scoreArr[i];
						topScoreStudentNum = i;
					}
					total += scoreArr[i];
				}
				avg = (double)total / studentCount;
				
				System.out.println("[분석]");
				System.out.println("등록된 학생 수 : " + studentCount);
				System.out.println("1등 : [" + topScoreStudentNum + "번 - " + topScore + " 점]");
				System.out.println("총점 : " + total);
				System.out.println("평균 : " + avg);
				
				System.out.println(String.format("평균 : %.2f", avg));
				break;
				
			default:
				break;
			}
			
		}
		
		sc.close();
		
	}
}
