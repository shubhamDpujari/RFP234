package day13Practiceprb;

public class Uc3String {

	public static < E extends Comparable<E> >
	E max(E... elements) 
	{
		E max = elements[0];
		for (E element : elements) 
		{
			if (element.compareTo(max) > 0) 
			{
				max = element;
			}
		}
		return max;
	}

	public static void main(String[] args) {

		String [] str = {"shubham","sai","swapnil"};

		System.out.println("String Max: " + max(str));


	}

}
