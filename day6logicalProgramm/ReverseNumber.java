package day6logicalProgramm;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {

		int num;
		int reminder;

		System.out.println("Enter a Number" );
		Scanner input = new Scanner(System.in);
		num = input.nextInt();

		while(num>0)
		{
			reminder = num%10;
			System.out.println("the reverse number: "+reminder);
			num = num/10;
		}


	}

}
