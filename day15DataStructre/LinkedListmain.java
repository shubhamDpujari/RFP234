package day15DataStructre;

//import java.util.LinkedList;

public class LinkedListmain {

	public static void main(String[] args) {

		LinkedList<Integer> list = new LinkedList();

//		list.add(56);
//		list.add(30);
//		list.add(70);
//
//		list.add(70);
//		list.add(30);
//		list.add(56);

		//		list.append(56);
		//		list.append(30);
		//		list.append(70);
		//
		//		list.display();

		list.append(56);
		list.append(70);
		list.insert(30);
		list.display();

		System.out.println();
		//		System.out.println(list.pop());
		//		list.display();

		//		System.out.println(list.popLast());
		//		list.display();


		if(list.search(30) != null) {
			System.out.println("kay is found");
		}else {
			System.out.println("key is not found");
		}


		System.out.println(list.insertAfter(30, 40));
		list.display();


		list.popElement(40);
		list.display();
		System.out.println();
		System.out.println(list.size());










	}

}
