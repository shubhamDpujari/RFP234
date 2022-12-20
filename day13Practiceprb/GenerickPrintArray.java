package day13Practiceprb;

public class GenerickPrintArray<E> {

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

	public static void main(String[] args) 
	{
		Integer [] intValue = { 30, 20, 50, 60,35};
		Double [] doubleValue= {425.2, 658.4,928.4};
		Float [] floatvalue = {3.1f, 2.7f, 1.6f, 9.0f};
		String [] str = {"shubham","sai","swapnil"};

		System.out.println("Integer Max: " + max(intValue));

		System.out.println("Double Max: " + max(doubleValue));

		System.out.println("Float Max: " + max(floatvalue));

		System.out.println("String Max: " + max(str));


	}

}
