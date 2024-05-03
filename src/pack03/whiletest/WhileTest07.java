package pack03.whiletest;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class WhileTest07 {
	
	List<Integer> numList = new LinkedList<>();
	
	public void add(int _num) {
		numList.add(_num);
	}
	public void print() {
		if (numList.isEmpty()) {
			System.out.println("List Empty");
		}
		int index = 0;
		System.out.println("[List 내의 값 : " + numList.size() + " ]");
		for (int i : numList) {
			System.out.print((index++) + ".[" + i + "] ");
			
			if (0 == (index % 7)) {
				System.out.println();
			}
		}
		System.out.println();
	}
	
	public void delete(int _index) {
		if (numList.isEmpty()) {
			System.out.println("List Empty");
			return;
		}
		if (0 > _index || _index >= numList.size()) {
			System.out.println("Index : " + _index + " delete fail");
			return;
		}
		numList.remove(_index);
		
		System.out.println("Index : " + _index + " delete");
	}
	
	public void clear() {
		numList.clear();
	}
	
	public static void main(String[] args) {
		
		WhileTest07 temp = new WhileTest07();
		
		Scanner sc = new Scanner(System.in);
		int num = 0;
		
		
		while (true) {
			System.out.println("=====[작업목록]=====");
			System.out.println("[0]종료 [1]입력 [2]출력 [3]삭제 [4]전체삭제");
			System.out.print("작업 선택 : ");
			num = sc.nextInt();
			int inputNum = 0;
			
			switch (num) {
			case 0: 
				System.out.println("종료.");
				break;
			case 1: 
				while (true) {
					System.out.print("(입력 종료 : -1) 입력 : ");
					inputNum = sc.nextInt();
					
					if (-1 == inputNum) {
						break;
					}
					temp.add(inputNum);
				}
				break;
			case 2: 
				System.out.println("출력.");
				temp.print();
				break;
			case 3: 
				temp.print();
				System.out.print("삭제 : ");
				inputNum = sc.nextInt();
				temp.delete(inputNum);
				break;
			case 4:
				System.out.println("전체 삭제");
				temp.clear();
				break;
			default:
				System.out.println("잘못된 입력입니다.");
				break;
			}
			
			if (0 == num) {
				break;
			}
			
		}
		
		sc.close();
		
	}

}
