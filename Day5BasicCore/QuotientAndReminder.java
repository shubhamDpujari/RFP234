package Day5BasicCore;

import java.util.Scanner;

public class QuotientAndReminder {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the Dividend");
		int Dividend = input.nextInt();

		System.out.println("Enter the diviser");
		int diviser = input.nextInt();

		int quotient = Dividend/diviser;
		int reminder = Dividend % diviser;

		System.out.println("the quotient is: "+quotient);

		System.out.println("the reminder is: "+reminder);


	}

}
