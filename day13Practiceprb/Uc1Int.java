package day13Practiceprb;

public class Uc1Int {

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

		Integer [] intValue = { 30, 20, 50, 60,35};

		System.out.println("Integer Max: " + max(intValue));



	}

}
