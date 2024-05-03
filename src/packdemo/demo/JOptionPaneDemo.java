package packdemo.demo;

import javax.swing.JOptionPane;

public class JOptionPaneDemo {

	public static void main(String[] args) {
		String msg = "메세지";
		String title = "타이틀";
		// #1 showMessageDialog : 메세지 판업
		// 부모컴포넌트(주로 null) , 내용, 타이틀, 아이콘 타입
		/*
		// 아이콘 타입 : ERROR, INFORMATION, QUESTION, WARNING, PLAIN
		JOptionPane.showMessageDialog(null, msg);
		JOptionPane.showMessageDialog(null, msg, "Error Icon", JOptionPane.ERROR_MESSAGE);
		JOptionPane.showMessageDialog(null, msg, "Info Icon", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, msg, "Question Icon", JOptionPane.QUESTION_MESSAGE);
		JOptionPane.showMessageDialog(null, msg, "Warning Icon", JOptionPane.WARNING_MESSAGE);
		JOptionPane.showMessageDialog(null, msg, "none Icon", JOptionPane.PLAIN_MESSAGE);
		*/
		
		// #2 showConfirmDialog : 선택 옵션을 제공하는 판업
		// 부모컴포넌트(주로 null) , 내용, 타이틀, 판업상자서 고를 옵션 타입, 아이콘 타입
		// 옵션 : DEFAULT, OK_CANCEL, YES_NO, YES_NO_CANCEL
		/*
		// 옵션 선택 반환 값 : OK = 0, YES = 0, NO = 1, CANCEL = 2, X(판업종료) = -1
		int result1 = 0, result2 = 0, result3 = 0, result4 = 0;

		result1 = JOptionPane.showConfirmDialog(null, msg, "Default", 
				JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
		result2 = JOptionPane.showConfirmDialog(null, msg, "Ok Cancel", 
				JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
		result3 = JOptionPane.showConfirmDialog(null, msg, "Yes No", 
				JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
		result4 = JOptionPane.showConfirmDialog(null, msg, "Yes No Cancel", 
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
		
		System.out.println("OK = 0, YES = 0, NO = 1, CANCEL = 2, X(판업종료) = -1");
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
		System.out.println("result4 : " + result4);
		*/
		
		// #3 showInputDialog : 키보드 입력을 직접 받는 판업
		
		// 부모컴포넌트(주로 null) , 내용, 입력창에 기본으로 적을 내용
		String defaultMsg = "임시 입력 값";
		JOptionPane.showInputDialog(null, msg, defaultMsg);
		// 부모컴포넌트(주로 null) , 내용, 타이틀, 아이콘 타입
		JOptionPane.showInputDialog(null, msg, "타이틀", JOptionPane.INFORMATION_MESSAGE);
		// 부모컴포넌트(주로 null) , 내용, 타이틀, 아이콘 타입, null, 선택지 옵션 배열, 기본 선택지 
		// 옵션을 고르고 나온 반환값이 Object 타입이라 형변환 필요
		String[] optionStr = { "Option1", "Option2", "Option3" };
		String result = (String)JOptionPane.showInputDialog(null, msg, "OptionSelect", 
				JOptionPane.INFORMATION_MESSAGE, null, optionStr, optionStr[1]);
		
		System.out.println(result);
		
		
		// #4 showOptionDialog : 직접 정의한 옵션을 보여주고 고르게 할수 있는 판업
		// 부모컴포넌트(주로 null) , 내용, 타이틀, 판업상자서 고를 옵션 타입, 아이콘 타입, null, 옵션 지정 배열, 배열중 기본값
		// 반환값 : 선택한 옵션의 배열 인덱스
		
		/*
		String[] OptionList = { "Option1", "Option2", "Option3" };
		int index = JOptionPane.showOptionDialog(null, msg, "Option", JOptionPane.OK_CANCEL_OPTION,
				JOptionPane.INFORMATION_MESSAGE, null, OptionList, OptionList[1]);
		
		System.out.println(index);
		*/
		
	}

}
