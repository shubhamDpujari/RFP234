package review;

import java.util.Scanner;

public class TicTacToe {

	private char[] board;
	private char currentPlayer;
	private Scanner Scanner;


	public void TicTacToeGame() {
		char[] board = new char[10];
		currentPlayer = 'X';
		Scanner = new Scanner(System.in);
		initializeBoard();
	}

	public void  initializeBoard() {
		for (int i = 0; i < 10; i++) {
			board[i] = ' ';
			System.out.println(i);
		}
	}
		  public void printBoard() {
			    System.out.println("-------------");

			    for (int i = 1; i <= 9; i++) {
			      System.out.print("| " + board[i] + " | ");
			      if (i % 3 == 0) {
			        System.out.println();
			        System.out.println("-------------");
			      }
			    }


	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
