package Day3PracticePrb;

import java.text.DecimalFormat;

import java.util.Scanner;


public class LineComarision2 {




	public static void main(String[] args) 
	{

		double x1 = 0;
		double x2 = 0;
		double y1 = 0;
		double y2 = 0;
		double length = 0;

		System.out.println();
		System.out.println("Hello...! Welcome to UC Programming : ");
		System.out.println();

		Scanner sc = new Scanner(System.in);
		DecimalFormat def = new DecimalFormat("0.00");

		System.out.println("Please Enter x1 co-ordinates : ");
		x1 = sc.nextInt();
		System.out.println("Please Enter y1 co-ordinates : ");
		y1 = sc.nextInt();
		System.out.println("Please Enter x2 co-ordinates : ");
		x2 = sc.nextInt();
		System.out.println("Please Enter y2 co-ordinates : ");
		y2 = sc.nextInt();


		length = Math.sqrt(Math.pow(x2 - x1, 2)) + (Math.pow(y2 - y1, 2));
		System.out.println("The lenght is :" + def.format(length));

		String s1 = "x1";
		String s2 = "x2";
		String s3 = "y1";
		String s4 = "y2";


		if (s1.equals(x2)) 
		{
			System.out.println(x1 + "equal" + x2);
		}
		else if (s1.equals(y2)) 
		{
			System.out.println(x1 + "equal" + y1);
		}
		else if (s2.equals(y1)) 
		{
			System.out.println(y1 + "equal" + y1);
		}
		else if (s1.equals(y2)) 
		{
			System.out.println(x1 + "equal" + y2);
		}
	}
}


