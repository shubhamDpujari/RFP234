package Day5BasicCore;

import java.util.Scanner;

public class VowelOrConsonant {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("enter the Alphabet");
		char Alphabet = input.next().charAt(0);

		if (Alphabet == 'a' || Alphabet == 'e' || Alphabet == 'i' || Alphabet == 'o' || Alphabet == 'u') {
			System.out.println(Alphabet + "is vowel");
		}
		else {
			System.out.println(Alphabet + "is a constant");
		}


	}

}