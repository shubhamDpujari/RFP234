package collection;

import java.util.Stack;

public class PracticeStack {

	public static void main(String[] args) {
		
		Stack<String> animals = new Stack<>();
		
		animals.add("Tigar");
		animals.add("cat");
		animals.add("dog");
		animals.add("rabit");
		animals.add("lion");
		System.out.println(  animals);
		
	  System.out.println(animals.pop());
	  System.out.println(animals.peek());
		
		

	}

}
