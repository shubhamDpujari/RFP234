package practicePrbDay16And17;
import java.util.Arrays;
import java.util.Scanner;

public class AnagramDetection {
	

		public static void main(String[] args) {

			String string1;
			String string2;
			Scanner sc = new Scanner(System.in);

			System.out.print("Enter the first string : ");
			string1 = sc.nextLine();

			System.out.print("Enter the second string : ");
			string2 = sc.nextLine();

			string1 = string1.toLowerCase();
			string2 = string2.toLowerCase();
			if (string1.length() == string2.length()) {
				char[] array1 = string1.toCharArray();
				char[] array2 = string2.toCharArray();

				Arrays.sort(array1);
				Arrays.sort(array2);
				boolean result = Arrays.equals(array1, array2);

				if (result) {
					System.out.println("The strings " + string1 + " and " + string2 + " are anagram.");
				} else {
					System.out.println("The strings " + string1 + " and " + string2 + " are not anagram.");
				}
			} else {
				System.out.println("The strings " + string1 + " and " + string2 + " are not anagram.");
			}
		}

	}
	


