package Day5BasicCore;

import java.util.Scanner;

public class HarmonicNunber {

	public static void main(String[] args) {

		System.out.println("enter the number: ");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		double result =0.0;

		System.out.println("the Harmonic series is :");

		while (num>0) {
			result = result + (double)1 / num;

			num--;
			System.out.println(result +  " ");

		}
		System.out.println("the harmonic nubmer for given num: " +result);
	}

}
