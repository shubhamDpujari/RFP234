package Day5BasicCore;


import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {

		int a[][]=new int[2][2];
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a Array element ");
		for(int i=0; i<2; i++)
		{
			for(int j=0; j<2; j++)
			{
				a[i][j]=input.nextInt();
			}
		}
		System.out.print("matrix: \n");
		for(int i=0; i<2; i++)
		{
			for(int j = 0; j<2; j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.print(" \n");
		}


	}

}
