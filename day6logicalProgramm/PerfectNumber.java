package day6logicalProgramm;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {

		int num;
		int sum = 0;

		System.out.println("Enter a Number" );
		Scanner input = new Scanner(System.in);
		num = input.nextInt();

		for (int i = 1; i < num; i++)
		{
			if(num%i == 0)
			{
				sum = sum+i;
			}
		}
		if(num == sum)
			System.out.println("perfect number");
		else
			System.out.println("not a perfect no");
	}

}
