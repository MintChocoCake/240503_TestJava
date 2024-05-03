package packdemo.demotest;

import java.util.Collection;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;
import java.util.Stack;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.HashSet;


import java.util.Queue;
import java.util.Deque;

public class CollectionTest {

	public static void main(String[] args) {

		Collection<String> CollStr1 = new ArrayList<String>();
		//Collection<String> CollStr2 = new List<String>();
		//Collection<String> CollStr3 = new Set<String>();
		//Collection<String> CollStr4 = new Queue<String>();
		//Collection<String> CollStr5 = new Deque<String>();
		
		List<String> listStr1 = new ArrayList<String>();
		List<String> listStr2 = new LinkedList<String>();
		List<String> listStr3 = new Vector<String>();
		List<String> listStr4 = new Stack<String>();
		
		Set<String> setStr1 = new TreeSet<String>();
		SortedSet<String> setStr2 = new TreeSet<String>();
		Set<String> setStr3 = new HashSet<String>();

		Queue<String> queStr1 = new LinkedList<String>();
		Deque<String> queStr2 = new LinkedList<String>();
		
	}

}
