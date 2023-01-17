package workshop;

import java.util.Scanner;

public class demo {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String [] stArray = { "shubham", "sagar", "sai"};
		System.out.println("enter the char");
		char ch = input.next().charAt(0);

		
		accurance(stArray, ch);
	}

	public static void accurance(String[]  name, char ch) {

		int count = 0;

		for (int i = 0; i < name.length; i++) {
			String st = name[i];
			for (int j = 0; j<st.length(); j++) {
				if (st.charAt(j) == ch) {
					count++;

				}
				
			}
			System.out.println(+ count);
		}
	}
}


