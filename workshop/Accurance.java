package workshop;

import java.util.Scanner;

public class Accurance {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter the string");
		String str = input.next().toLowerCase();	

		System.out.println("enter the charchter to be checked");
		char ch = input.next().charAt(0);
		chekoccurance(str,ch);
	}


	public static void chekoccurance(String name, char ch) {
		int occurance = 0;
		for (int i = 0; i< name.length(); i++) {
			if (name.charAt(i) == ch) {
				occurance++;
				System.out.println("the occurance of the letter is " + occurance);
			}

		}
	}
}


