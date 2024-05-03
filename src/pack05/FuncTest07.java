package pack05;

import java.util.Scanner;

public class FuncTest07 {

	public String eduStep(int _edu) {
		String step = "";
		
		switch (_edu) {
		case 1:
			step = "Step1";
			break;

		case 2:
			step = "Step2";
			break;

		case 3:
			step = "Step3";
			break;

		default:
			step = "None";
			break;
		}
		
		return step;
	}

	public static void main(String[] args) {
		// 사용자로부터 스터디 단계를 입력받아 EduStep 호출
		// 메소드를 호출한 결과값을 반환받아 step에 저장
		FuncTest07 test = new FuncTest07();

		Scanner sc = new Scanner(System.in);
		System.out.print("스터디 단계 입력 : ");
		int num = Integer.parseInt(sc.nextLine());
		
		String msg = test.eduStep(num); 
		test.eduStep(num); 
		System.out.println("해당 스터디 단계 : " + msg);
		
		sc.close();
	}

}
