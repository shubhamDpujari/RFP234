package workshop;

public class Convert {



	public static void main(String[] args) {
		String string = "my met name is moti.";
		String oldWord = "moti";
		String newWord = "tommy";

		// Split the string into an array of words
		String[] words = string.split(" ");

		// Iterate through the array of words
		for (int i = 0; i < words.length; i++) {
			// If the current word is the old word, replace it with the new word
			if (words[i].equals("moti")) {
				words[i] = "tommy";
			}
		}

		// Join the array of words back into a single string
		String newString = String.join("", words);

		System.out.println(newString);  // Output: "The slow brown fox jumps over the lazy dog."
	}

}







