package day13Practiceprb;

public class Uc2Double {

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

		Double [] doubleValue= {425.2, 658.4,928.4};

		System.out.println("Double Max: " + max(doubleValue));


	}

}
