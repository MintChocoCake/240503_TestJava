package packdemo.demo;

import java.util.ArrayList;
import java.util.List;

// ArrayList 스택
public class StackDemo_ArrayList {
	
	// Java에서 Collection/List 요소로 기본 데이터 타입 사용불가 (int, double 등)
	// 기본 데이터 타입의 래퍼 클래스를 사용해야 함 (Integer, Double 등) 
	List<Integer> ArrayList = new ArrayList<>(); 
	
	// push, pop, clear, empty, get ,set , peek (마지막 요소 반환)
	
	public void push(int val) {
		// Collection타입으로는 index가 포함된 add 를 사용불가 -> List 변경
		ArrayList.add(0, val);
	}
	
	public void pop() {
		int end = ArrayList.size() - 1;
		ArrayList.remove(end);
	}
	
	public void clear() {
		ArrayList.clear();
	}
	
	public boolean empty() {
		return ArrayList.isEmpty();
	}
	
	public int get(int index) {
		return ArrayList.get(index);
	}
	
	public void set(int index, int val) {
		ArrayList.set(index, val);
	}
	
	public int peek() {
		int end = ArrayList.size() - 1;
		return ArrayList.get(end);
	}
	
	public void show() {
		//ArrayList.iterator().hasNext();
		
		System.out.println("[ ArrayList Val ]");
		
		// Java 내에서 오토 언박싱 기능 제공 Integer 객체를 int 값으로 자동 형 변환 시킴
		for (int i : ArrayList) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		StackDemo_ArrayList stack = new StackDemo_ArrayList();
		
		System.out.println("Empty : " + stack.empty());
		
		for (int i = 0; i < 10; i++) {
			stack.push(i);
		}
		stack.show();
		
		System.out.println("Empty : " + stack.empty());
		
		for (int i = 0; i < 3; i++) {
			stack.pop();
		}
		stack.show();
		
		System.out.println("Get 2 : " + stack.get(2));
		
		stack.set(3, 12);
		System.out.println("Set 3,12");
		stack.show();
		
		stack.set(5, 20);
		System.out.println("Set 5,20");
		stack.show();
		
		System.out.println("Get 5 : " + stack.get(5));
		
		stack.peek();
		System.out.println("Peek");
		stack.show();
		
		stack.clear();
		System.out.println("Clear");
		stack.show();
		System.out.println("Empty : " + stack.empty());
		
	}
	
}
