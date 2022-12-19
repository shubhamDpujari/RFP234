package day4Practiceprb;

import java.util.Random;

public class SnakeAndLadder {
	// constants for the minimum and maximum values of the die
	private static final int MIN_DIE_VALUE = 1;
	private static final int MAX_DIE_VALUE = 6;

	// constants for the minimum and maximum values of the board
	private static final int MIN_BOARD_VALUE = 1;
	private static final int MAX_BOARD_VALUE = 100;

	// array to store the positions of the ladders on the board
	private static final int[] LADDERS = {3, 8, 28, 58, 75, 80};

	// array to store the positions of the snakes on the board
	private static final int[] SNAKES = {17, 52, 57, 62, 88, 95};

	public static void main(String[] args) {
		Random random = new Random();

		// current position of the player on the board
		int position = 0;

		while (position < MAX_BOARD_VALUE) {
			// roll the die to get a random number between MIN_DIE_VALUE and MAX_DIE_VALUE
			int dieValue = MIN_DIE_VALUE + random.nextInt(MAX_DIE_VALUE - MIN_DIE_VALUE + 1);

			System.out.println("You rolled a " + dieValue + "!");

			// move the player forward by the value of the die
			position += dieValue;

			// check if the player has landed on a ladder
			for (int ladder : LADDERS) {
				if (position == ladder) {
					System.out.println("You landed on a ladder! Climb up to " + (position + dieValue) + ".");
					position += dieValue;
					break;
				}
			}

			// check if the player has landed on a snake
			for (int snake : SNAKES) {
				if (position == snake) {
					System.out.println("You landed on a snake! Slide down to " + (position - dieValue) + ".");
					position -= dieValue;
					break;
				}
			}

			// make sure the player's position stays within the bounds of the board
			position = Math.min(MAX_BOARD_VALUE, Math.max(MIN_BOARD_VALUE, position));

			System.out.println("You are now at position " + position + ".");
		}

		System.out.println("Congratulations! You have reached the winning spot.");
	}
}



