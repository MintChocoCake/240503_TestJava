package packdemo.demotest;

import packdemo.demo.SingletonDemo;

public class SingletonTest02 {

	public static void main(String[] args) {
		
		SingletonDemo instance1 = SingletonDemo.getInstance();
		
		instance1.setName("코코모");
		instance1.setAddress("아크라시아");
		
		System.out.println(instance1.getName());
		System.out.println(instance1.getAddress());
		
		SingletonDemo instance2 = SingletonDemo.getInstance();
		
		System.out.println(instance2.getName());
		System.out.println(instance2.getAddress());
		
	}

}
