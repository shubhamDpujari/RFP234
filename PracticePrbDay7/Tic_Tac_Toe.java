package PracticePrbDay7;

import java.util.Scanner;

public class Tic_Tac_Toe {
	

	

	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);

			System.out.println("Enter the name of Player 1 ");
			String p1 = sc.nextLine();
			System.out.println("Enter the name of Player 2 ");
			String p2 = sc.nextLine();

			char[][] board = new char[3][3];

			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					board[i][j] = '-';
				}

			}

			boolean isPlayer1 = true;

			boolean gameended = false;
			
			while (!gameended) {

				drawBoard(board);

				char symbol = ' ';
				if (isPlayer1) {
					symbol = 'x';
				} else {
					symbol = 'o';
				}

				if (isPlayer1) {
					System.out.println(p1 + "Turn (x):");
				} else {
					System.out.println(p2 + "Turn (o):");

				}

				int row = 0;
				int col = 0;

				while (true) {

					System.out.println("Enter a row (0, 1, 2 :");
					row = sc.nextInt();
					System.out.println("Enter a column (0, 1, 2 :");
					col = sc.nextInt();

					if (row < 0 || col < 0 || row > 2 || col > 2) {
						System.out.println("your row and column are out of bounds");
					} else if (board[row][col] != '-') {
						System.out.println("the place is already taken");
					} else {
						// row and column are valid
						break;
					}
				}
				board[row][col] = symbol;

				if (hasWon(board) == 'x') {
					System.out.println(p1 + "has won");
					gameended = true;
				} else if (hasWon(board) == 'o') {
					System.out.println(p1 + "has won");
					gameended = true;
				} else {
					if (hasTied(board)) {
						System.out.println("it is a tie");
						gameended = true;
					} else {
						isPlayer1 = !isPlayer1;
					}
				}

			}
			drawBoard(board);
		}

		public static void drawBoard(char[][] board) {
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					System.out.print(board[i][j]);
				}
				System.out.println();
			}
		}

		public static char hasWon(char[][] board) {

			for (int i = 0; i < 3; i++) {
				if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != '-') {
					return board[i][0];
				}
			}

			for (int j = 0; j < 3; j++) {
				if (board[0][j] == board[1][j] && board[1][j] == board[2][j] && board[0][j] != '-') {
					return board[j][0];

				}

			}

			if (board[2][0] == board[1][1] && board[1][1] == board[0][2] && board[0][0] != '-') {
				return board[0][0];
			}
			if (board[2][0] == board[1][1] && board[1][1] == board[0][2] && board[2][0] != '-') {
				return board[2][0];
			}

			return '-';
		}

		public static boolean hasTied(char[][] board) {
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					if (board[i][j] == '-') {
						return false;
					}
				}
			}
			return true;
		}
	}
	


