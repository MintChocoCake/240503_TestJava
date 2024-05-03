package packdemo.demo;

// 배열 큐
public class QueueDemo_Array {

	final int max = 1000;
	
	int[] queue = new int[max];;
	
	int front = 0; // 앞쪽 index, pop 할때 참조
	int end = 0; // 뒤쪽 index, push 할때 참조
	
	// push, pop, head, end, Isempty
	boolean push(int _val) {
		if (max <= end) {
			System.out.println("max push over");
			return false;
		}
		System.out.println("[push]");
		queue[end++] = _val;
		return true;
	}
	
	void pop() {
		if (front >= end) {
			System.out.println("none pop");
			return;
		}
		System.out.println("[pop] ");
		++front;
	}
	
	int head() {
		if (front == end) {
			System.out.println("head empty");
			return 0;
		}
		return queue[front];
	}
	int tail() {
		if (front == end) {
			System.out.println("tail empty");
			return 0;
		}
		return queue[end - 1];
	}
	
	boolean isEmpty() {
		if (front == end) {
			return true;
		}
		return false;
	}
	
	void clear() {
		for (int i = 0; i < queue.length; i++) {
			queue[i] = 0;
		}
		front = end = 0;
	}
	
	int size() {
		return end - front;
	}
	
	boolean searchToVal(int _val) {
		for (int i = front; i < end; i++) {
			if (_val == queue[i]) {
				return true;
			}
		}
		
		return false;
	}
	
	// 가장 마지막 pop된 원소
	int lastpop() {
		if (0 < (front - 1) || end < (front - 1)) {
			return 0;
		}
		return queue[front - 1];
	}
	
	void show() {
		System.out.println("[ queue list ]");
		for (int i = front; i < end; i++) {
			System.out.print(queue[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		QueueDemo_Array queue = new QueueDemo_Array();
		
		for (int i = 0; i < 20; i++) {
			queue.push(i + 5);
		}

		System.out.println("size : " + queue.size());
		System.out.println("head : " + queue.head());
		System.out.println("tail : " + queue.tail());
		
		queue.show();
		
		for (int i = 0; i < 3; i++) {
			queue.pop();
		}
		
		queue.show();
		
		System.out.println("Empty : " + queue.isEmpty());
		
		System.out.println("Search Val 15 : " + queue.searchToVal(15));
		System.out.println("Search Val 25 : " + queue.searchToVal(25));
		
		queue.clear();
		queue.show();
		
	}

}
