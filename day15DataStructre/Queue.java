package day15DataStructre;

public class Queue<T> {
	LinkedList<T> list = new LinkedList<>();

	void append(T key) {

		list.append(key);
	}

	T pop( T key){
		return list.pop();
	}

	void push(T key) {
		list.add(key);
	}

	void print() {
		list.display();
	}




}


