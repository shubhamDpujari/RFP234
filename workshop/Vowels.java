package workshop;

public class Vowels {
	public static void main(String[] args) {
		String [] array = {"shubhamz", "sai", "murtuja", "omkar"};
		char [] array1 = {'a','e','i','o','u','m','z'};

//		int count = 0;
		for (String e: array) {
			int count =0;

			for (int i =0; i<e.length(); i++) {
				char c = e.charAt(i);

				if(c =='a' || c == 'e' || c =='i' || c == 'o'|| c == 'u' || c == 'z'|| c == 'm') {
					count++;
				}
			}
			System.out.println("the string " + e +" contains " + count + "letter"  );

		}

	}





}
