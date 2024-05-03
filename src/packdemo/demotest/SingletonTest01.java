package packdemo.demotest;

import packdemo.demo.SingletonDemo;

public class SingletonTest01 {

	public static void main(String[] args) {

		SingletonDemo instance1 = SingletonDemo.getInstance();
		SingletonDemo instance2 = SingletonDemo.getInstance();
		SingletonDemo instance3 = SingletonDemo.getInstance();

		System.out.println(instance1);
		System.out.println(instance2);
		System.out.println(instance3);

		System.out.println(instance1 == instance2);
		System.out.println(instance1 == instance3);

		System.out.println("===============");
		
		// 싱글톤은 멀티쓰레드 환경에 안전하지 않다.. 넘어렵고;
		Thread thread1 = new Thread(() -> {
			SingletonDemo instance = SingletonDemo.getInstance();
			System.out.println(instance);
		});
		Thread thread2 = new Thread(() -> {
			SingletonDemo instance = SingletonDemo.getInstance();
			System.out.println(instance);
		});
		Thread thread3 = new Thread(() -> {
			SingletonDemo instance = SingletonDemo.getInstance();
			System.out.println(instance);
		});
		
		thread1.start();
		thread2.start();
		thread3.start();
		
		
	}
}
