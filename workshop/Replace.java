package workshop;

public class Replace {
	
	public static void myreplace (String oldword, String newword) {
		

	}
		
	

	public static void main(String[] args) {
		String string = "my pet name is moti";
		String oldword = "moti";
		String newword = "tommy";

		String[]words = string.split("");

		for (int i = 0; i< words.length; i++) {
			if(words[i].equals("moti")) {
				words[i]="tommy";
			}
		}
		String newString = String.join(newword, words);
		System.out.println(newString);

	}

}
