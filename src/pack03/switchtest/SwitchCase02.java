package pack03.switchtest;

import javax.swing.JOptionPane;

public class SwitchCase02 {

	public static void main(String[] args) {
		
		int resultNum = 0;
		String resultStr = "";
		
		String[] selectList = { "[예금조회]", "[입금]", "[출금]", "[송금]" };
		resultStr = (String)JOptionPane.showInputDialog(null, "원하는 기능 선택", "메뉴", 
				JOptionPane.INFORMATION_MESSAGE, null, selectList, selectList[0]);
		
		resultNum = 4;
		for (int i = 0; i < selectList.length; i++) {
			if (selectList[i].equals(resultStr)) {
				resultNum = i;
			}
		}

		
		switch (resultNum) {
		case 0: 
			System.out.println("예금조회 선택");
			break;
		case 1: 
			System.out.println("입금 선택");
			break;
		case 2: 
			System.out.println("출금 선택");
			break;
		case 3: 
			System.out.println("송금 선택");
			break;
		default:
			System.out.println("잘못된 입력");
			break;
		}
		
		
	}

}
