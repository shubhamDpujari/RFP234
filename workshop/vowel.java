package workshop;

public class vowel {

	public static void main(String[] args) {

		String[] array = {"shubham", "sanjay", "bridgelabz"};
		char [] chars = {'a','e','i','o','u','m','z'};
		countElement(array, chars);


	}

	private static void countElement(String[] array, char[] chars) {
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			String str = array[i];
			for(int i1 = 0; i1<str.length(); i1++) {
				for (int j =0; j< chars.length; j++) {
					if(str.charAt(i) == chars[j]) {
						count++;
					}

				}
				System.out.println("the element " + count);

			}
		}

	}

}
