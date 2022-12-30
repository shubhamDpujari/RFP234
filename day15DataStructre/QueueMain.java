package day15DataStructre;

public class QueueMain {

	public static void main(String[] args) {

		Queue<Integer> queue = new Queue<>();
		//	Enqueue	

		queue.append(56);
		queue.append(30);
		queue.append(70);
		queue.print();


		//	Dequeue

		System.out.println();
		queue.pop(30);
		queue.print();







	}

}
