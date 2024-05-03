package packdemo.demotest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class ListTest {

	public static void main(String[] args) {
		
		List<String> listStr1 = new ArrayList<String>();
		List<String> listStr2 = Arrays.asList("one", "two", "three", "four");
		List<String> listStr3 = List.of("11", "22", "33");
		
		List<String> listStr4 = new Vector<String>();
		
		listStr4.add("IsVector");
		
		listStr1.addAll(listStr2);
		listStr1.addAll(listStr3);
		listStr1.addAll(listStr4);
		
		// new 로 메모리를 할당하지 않아서 원소 추가 불가
		// listStr2.add("Hi");
		// listStr3.add("Hi");
		
		System.out.println("listStr1 : " + listStr1);
		
		listStr1.set(2, listStr1.get(3) + "77");
		
		System.out.println("listStr1 : " + listStr1);
		System.out.println("listStr2 : " + listStr2);
		System.out.println("listStr3 : " + listStr3);
		
		System.out.println("IndexOf : " + listStr1.indexOf("IsVector"));
		System.out.println("lastIndexOf : " + listStr1.lastIndexOf("IsVector"));
		System.out.println("contains : " + listStr1.contains("IsVector"));
		
	}

}
