package pack05;

import java.util.Scanner;

public class FuncTest06 {

	public void eduStep(int _edu) {
		String msg = "";
		// msg = "해당 스터디 단계는 step" + _edu + " 입니다." ;
		
		switch (_edu) {
		case 1:
			msg = "해당 스터디 단계는 step1 입니다.";
			break;
			
		case 2:
			msg = "해당 스터디 단계는 step2 입니다.";
			break;
			
		case 3:
			msg = "해당 스터디 단계는 step3 입니다.";
			break;
			
		default:
			msg = "해당하는 스터디 단계가 없습니다.";
			break;
		}
		
		System.out.println(msg);
	}
	
	public static void main(String[] args) {
		// 사용자로부터 스터디 단계를 입력받아 EduStep 호출
		
		FuncTest06 test = new FuncTest06();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("스터디 단계 입력 : ");
		int num = Integer.parseInt(sc.nextLine());
		
		test.eduStep(num);
		
		sc.close();
	}

}
