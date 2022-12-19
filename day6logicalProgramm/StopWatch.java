package day6logicalProgramm;

import java.util.Scanner;

public class StopWatch {

	public static void main(String[] args) {

		double startTime;
		double stopTime;

		System.out.println("enter 1 to start: ");
		Scanner input = new Scanner(System.in);
		input .next();
		startTime = System.currentTimeMillis();

		System.out.println("enter 2 to stop: ");
		input.next();
		stopTime = System.currentTimeMillis();

		double timeElapsed = (stopTime - startTime) / 1000;
		System.out.println("total time elapsed in millisecoends: 1" +timeElapsed);

	}

}
