package Day5BasicCore;

import java.util.Scanner;

public class FindingLeapYear {

	public static void main(String[] args) {
		
		System.out.println("Enter the year");
		Scanner input = new Scanner(System.in);
		int year = input.nextInt();

		if(year%400==0)
		{
			System.out.println("leap year");
		}
		else if(year%4==0 && year%100!=0)
		{
			System.out.println("leap year");
		}
		else
		{
			System.out.println("not a leap year");
		}

	}

}
