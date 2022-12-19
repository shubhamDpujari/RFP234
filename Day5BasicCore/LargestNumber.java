package Day5BasicCore;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {

		int num1;
		int num2;
		int num3;
		int largest;

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number 1");
		num1 = input.nextInt();
		System.out.println("Enter the number 2");
		num2 = input.nextInt();
		System.out.println("Enter the number 3");
		num3 = input.nextInt();

		if(num1 > num2)
		{
			if(num1 > num3)
			{
				System.out.println("num1 is larger number");
			}
			else
			{
				System.out.println("num3 is large number");
			}
		}
		else if (num2 > num1)
		{
			if (num2 > num3)
			{
				System.out.println("num2 is large number");
			}

			System.out.println("largest number,num1,num2,num3,largest");
		}


	}

}
