package day15DataStructre;

public class Node <T> {
	
	T key;
	Node<T>next;
	
	public Node(T key) {
		super();
		this.key = key;
	}

	@Override
	public String toString() {
		return "Node [key=" + key + ", next=" + next + "]";
	}
	
	

}
