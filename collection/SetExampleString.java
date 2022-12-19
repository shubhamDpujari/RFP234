package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.LinkedHashSet;

public class SetExampleString {

	public static void main(String[] args) {

		Set<String> stringSet = new HashSet();


		stringSet.add("java");
		stringSet.add("html");
		stringSet.add("javascript");
		stringSet.add("shellscript");

		System.out.println(stringSet);

		boolean issuccess = stringSet.add("java");
		System.out.println( issuccess );

		Iterator<String> iterator = stringSet.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());

			Set<String> stringlinkedset = new LinkedHashSet();

			stringlinkedset.add("shubham");
			stringlinkedset.add("amruta");
			stringlinkedset.add("Bramha");
			stringlinkedset.add("ram");

			System.out.println(stringlinkedset);
			Iterator<String> iterator1 = stringlinkedset.iterator();
			while( iterator1 .hasNext()) {
				System.out.println( iterator1 .next());
			}



		}



	}

}
