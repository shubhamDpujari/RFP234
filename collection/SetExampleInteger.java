package collection;

import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class SetExampleInteger {

	public static void main(String[] args) {
		Set<Integer> integerSet = new HashSet();

		integerSet.add(10);
		integerSet.add(30);
		integerSet.add(40);
		integerSet.add(60);
		integerSet.add(100);

		boolean issuccess = integerSet.add(100);
		System.out.println(issuccess);

		System.out.println(integerSet);

		for (int num : integerSet) {
			System.out.println(" using for each loop" +num);
		}
		integerSet.remove(40);

		Iterator<Integer> iterator = integerSet.iterator();

		while(iterator.hasNext()) {
			int num = iterator.next();
			System.out.println("using iterator while loop="+num);
		}

		//        LinkedHashset implemention

		Set<Integer> integerLinkedSet = new  LinkedHashSet();

		integerLinkedSet.add(65);
		integerLinkedSet.add(20);
		integerLinkedSet.add(30);
		integerLinkedSet.add(50);
		integerLinkedSet.add(30);
		
		System.out.println(integerLinkedSet);
		
		boolean issuccess1 = integerSet.add(30);
		System.out.println(issuccess1);
		
		Iterator<Integer> iterator1 = integerSet.iterator();
		while (iterator1.hasNext());
			int num = iterator1.next();
			System.out.println("while using iterator while loop="+ num);
		}






	}


