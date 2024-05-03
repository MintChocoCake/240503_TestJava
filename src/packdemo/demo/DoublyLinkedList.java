package packdemo.demo;

import java.util.Scanner;

class Node {
	private int val = 0;
	private Node next = null;
	private Node prev = null;

	public void setVal(int _val) {
		this.val = _val;
	}

	public void setNext(Node _node) {
		this.next = _node;
	}

	public void setPrev(Node _node) {
		this.prev = _node;
	}

	public int getVal() {
		return this.val;
	}

	public Node getNext() {
		return this.next;
	}

	public Node getPrev() {
		return this.prev;
	}
}

public class DoublyLinkedList {

	public final int MAX = 100;
	public Node[] dLinkedList = null;

	public Node head = null;
	public Node tail = null;
	public int size = 0;

	public Node curNode = null;
	public Node prevNode = null;

	public int count = 0;
	public boolean run = true;

	public DoublyLinkedList() {
		dLinkedList = new Node[MAX];
	}

	// 노드 추가
	public void addNode(int _index, int _val) {
		if (MAX <= _index) {
			System.out.println("addNode : index 범위 초과");
			return;
		}

		Node newNode = new Node();
		newNode.setVal(_val);

		if (0 == size) { // 최초 삽입
			addTheFirst(newNode);
		} else if (0 >= _index) { // 맨앞 삽입
			addFirst(newNode);
		} else if (size <= _index) { // 맨뒤 삽입
			addLast(newNode);
		} else { // 중간 삽입
			addNext(_index, newNode);
		}
	}

	// 최초 추가
	public void addTheFirst(Node _node) {
		if (null != head) {
			System.out.println("addTheFirst : 노드가 존재합니다.");
			return;
		}

		head = _node;
		tail = _node;
		dLinkedList[size++] = _node;
	}

	// 맨 앞 추가
	public void addFirst(Node _node) {
		if (null == head || null == tail) {
			System.out.println("addFirst : 노드가 비어있습니다.");
			return;
		}

		head.setPrev(_node);
		_node.setNext(head);
		head = _node;
		dLinkedList[size++] = _node;
	}

	// 맨 뒤 추가
	public void addLast(Node _node) {
		if (null == head || null == tail) {
			System.out.println("addLast : 노드가 비어있습니다.");
			return;
		}

		tail.setNext(_node);
		_node.setPrev(tail);
		tail = _node;
		dLinkedList[size++] = _node;
	}

	// 중간 추가
	public void addNext(int _index, Node _node) {
		if (0 > _index || size < _index || null == _node) {
			System.out.println("addNext Error");
			return;
		}

		curNode = head;
		prevNode = null;
		count = 0;
		run = true;

		while (run) {
			if (_index == count) {
				prevNode = curNode.getPrev();
				
				_node.setNext(curNode);
				_node.setPrev(prevNode);

				curNode.setPrev(_node);
				prevNode.setNext(_node);

				dLinkedList[size++] = _node;
				
				break;
			}
			
			// 끝이면 종료
			if (null == curNode.getNext()) {
				run = false;
			} 
			
			// 다음 노드 탐색.
			curNode = curNode.getNext();
			count++;
		}

	}

	// 삭제
	public void remove(int _index) {
		if (0 >= size || MAX <= _index) {
			System.out.println("remove : Error");
			return;
		}

		if (0 >= _index) { // 맨앞 삭제
			removeFirst();
		} else if (size <= _index) { // 맨뒤 삭제
			removeLast();
		} else { // 중간 삭제
			removeNext(_index);
		}

	}

	public void removeTheEnd() {

	}

	public void removeFirst() {

		if (head == tail) { // 1개 남았을 경우
			curNode = null;
			head = null;
			tail = null;
		} else {
			Node deleteNode = null;
			deleteNode = head;
			curNode = deleteNode.getNext();

			deleteNode.setNext(null);
			curNode.setPrev(null);

			head = curNode;
			deleteNode = null;
		}
		size--;

	}

	public void removeLast() {

		if (head == tail) { // 1개 남았을 경우
			curNode = null;
			head = null;
			tail = null;
		} else {
			Node deleteNode = null;

			deleteNode = tail;
			curNode = deleteNode.getPrev();

			deleteNode.setPrev(null);
			curNode.setNext(null);

			tail = curNode;
			deleteNode = null;

		}
		size--;

	}

	public void removeNext(int _index) {
		curNode = head;
		prevNode = null;
		count = 0;
		run = true;

		Node deleteNode = null;

		while (run) {

			if (_index == count) {
				deleteNode = curNode;
				
				prevNode = curNode.getPrev();
				curNode = curNode.getNext();

				if (null != prevNode) {
					prevNode.setNext(curNode);
				}
				if (null != curNode) {
					curNode.setPrev(prevNode);
				}
				
				// (2개남았을 경우) head 와 tail 만 남을경우 예외처리  
				if (tail == deleteNode) {
					tail = curNode;
				} else if (head == deleteNode) {
					head = curNode;
				}
				
				deleteNode.setNext(null);
				deleteNode.setPrev(null);
				deleteNode = null;
				
				size--;
				break;
			}

			if (null == curNode.getNext()) {
				run = false;
			}

			curNode = curNode.getNext();
			count++;
		}

	}

	public void clear() {
		for (Node node : dLinkedList) {
			if (null != node) {
				node.setNext(null);
				node.setPrev(null);
				node = null;
			}
		}

		head = null;
		tail = null;
		curNode = null;
		prevNode = null;
		size = 0;
	}

	// 전체 출력
	public void printListAll() {
		if (0 >= size) {
			return;
		}
		System.out.println("size : " + size);

		curNode = head;
		prevNode = null;
		count = 0;
		run = true;

		while (run) {
			// head로 부터 시작해 index를 측정 해당하는 index의 노드를 찾기.

			if (null != curNode.getPrev()) {
				prevNode = curNode.getPrev();
			}

			System.out.print("[" + count + "] ");
			System.out.print("(val : " + curNode.getVal() + ") ");
			if (null == curNode.getPrev()) {
				System.out.print("(prev : null) ");
			} else {
				System.out.print("(prev : " + curNode.getPrev().getVal() + ") ");
			}

			if (null == curNode.getNext()) {
				System.out.print("(next : null)");
				run = false;
			} else {
				System.out.print("(next : " + curNode.getNext().getVal() + ")");
			}
			System.out.println();

			curNode = curNode.getNext();
			count++;
		}

	}

	public void serachToIndex(int _index) {
		if (0 >= size || 0 > _index || size < _index) {
			System.out.println("serachToIndex Error");
			return;
		}

		curNode = head;
		prevNode = null;
		count = 0;
		run = true;
		
		while (run) {
			if (_index == count) {
				System.out.println("Index : " + count);
				System.out.println("val : " + curNode.getVal());
				System.out.println("prevNodeVal : " + curNode.getPrev().getVal());
				System.out.println("nextNodeVal : " + curNode.getNext().getVal());
				break;
			}
			
			if (null == curNode.getNext()) {
				run = false;
			} else {
				curNode = curNode.getNext();
				count++;
			}
			
		}
		
	}

	public static void main(String[] args) {

		DoublyLinkedList dLinkedList = new DoublyLinkedList();
		boolean run = true;

		Scanner sc = new Scanner(System.in);

		while (run) {
			int selectNum = 0;
			int index = 0;
			int val = 0;

			System.out.println("=====[이중연결리스트]=====");
			System.out.println("[0]종료 [1]추가 [2]삭제 [3]출력 [4]검색 [5]전체삭제");
			System.out.print("입력 : ");
			selectNum = Integer.parseInt(sc.nextLine());

			switch (selectNum) {
			case 0:
				run = false;
				break;

			case 1:
				while (true) {
					dLinkedList.printListAll();
					System.out.println("[추가] [종료 : index -1]");
					System.out.print("Index : ");
					index = Integer.parseInt(sc.nextLine());
					if (-1 == index)
						break;
					System.out.print("val : ");
					val = Integer.parseInt(sc.nextLine());

					dLinkedList.addNode(index, val);
				}
				break;

			case 2:
				while (true) {
					dLinkedList.printListAll();
					System.out.println("[삭제] [종료 : index -1]");
					System.out.print("Index : ");
					index = Integer.parseInt(sc.nextLine());
					if (-1 == index)
						break;

					dLinkedList.remove(index);
				}
				break;

			case 3:
				System.out.println("[출력]");
				dLinkedList.printListAll();
				break;

			case 4:
				while (true) {
					System.out.println("[검색] [종료 : index -1]");
					System.out.print("Index : ");
					index = Integer.parseInt(sc.nextLine());
					if (-1 == index)
						break;

					dLinkedList.serachToIndex(index);
				}
				break;
			
			case 5:
				System.out.println("[전체삭제]");
				dLinkedList.clear();
				break;
				
			default:
				System.out.println("잘못된 입력");
				break;
			}

		} // while

		sc.close();

	} // main

} // class
