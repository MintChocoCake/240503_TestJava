package packdemo.demotest;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListTest {

	public static void main(String[] args) {
		
		LinkedList<String> typeLinkedList = new LinkedList<String>();
		List<String> typeList = new LinkedList<String>();

		// List 타입은 사용불가한 메소드
		// offer(요소) : 요소를 마지막에 추가
		typeLinkedList.offer("11");
		typeLinkedList.offer("22");
		typeLinkedList.offer("33");
		typeLinkedList.offer("44");
		typeLinkedList.offer("55");
		System.out.println("offer() : " + typeLinkedList);
		// peek() : 첫 번째 요소 반환
		typeLinkedList.peek();
		System.out.println("peek() : " + typeLinkedList);
		// poll() : 첫 번째 요소 반환 후 삭제
		typeLinkedList.poll();
		System.out.println("poll() : " + typeLinkedList);
		
		System.out.println("===============");
		
		ListIterator<String> iter = typeLinkedList.listIterator();

		if (iter.hasNext()) { // 정방향
			System.out.println("Iter.next : " + iter.next());
			System.out.println("Iter.next : " + iter.next());
			System.out.println("Iter.next : " + iter.next());
		}
		
		if (iter.hasPrevious()) { // 역뱡향
			System.out.println("Iter.previous : " + iter.previous());
			System.out.println("Iter.previous : " + iter.previous());
			System.out.println("Iter.previous : " + iter.previous());
		}
		
		
	}

}
