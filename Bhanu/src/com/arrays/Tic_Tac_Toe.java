package com.arrays;

import java.util.Scanner;

public class Tic_Tac_Toe {
	static char[][] game = { { ' ', ' ', ' ' }, { ' ', ' ', ' ' }, { ' ', ' ', ' ' } };
	static Scanner sc = new Scanner(System.in);
	static char player = 'X';

	static boolean isValidMove(int row, int col) {
		if (row < 0 || row > 2 || col < 0 || col > 2 || game[row][col] != ' ') {
			return false;
		}
		return true;
	}

	static void displayBoard() {
		System.out.println("-------------");
		for (char ch[] : game) {
			System.out.print("| ");
			for (char ch1 : ch) {
				System.out.print(ch1 + " | ");
			}
			System.out.println();
			System.out.println("-------------");
		}
	}

	static boolean isWin() {
		// for checking all rows
		for (int i = 0; i < game.length; i++) {
			if (game[i][0] == player && game[i][1] == player && game[i][2] == player) {
				return true;
			}
		}
		// for checking all cols
		for (int i = 0; i < game.length; i++) {
			if (game[0][i] == player && game[1][i] == player && game[2][i] == player) {
				return true;
			}
		}
		// for diagonals
		if (game[0][0] == player && game[1][1] == player && game[2][2] == player) {
			return true;
		}
		// for another diagonal
		if (game[0][2] == player && game[1][1] == player && game[2][0] == player) {
			return true;
		}
		return false;
	}

	static boolean isDraw() {
		for (char ch[] : game) {
			for (char ch1 : ch) {
				if (ch1 == ' ') {
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		boolean flag = true;
		while (flag) {
			displayBoard();
			System.out.print("Enter the Row :");
			int row = sc.nextInt();
			System.out.print("Enter the Col :");
			int col = sc.nextInt();
			if (isValidMove(row, col)) {
				game[row][col] = player;
			} else {
				System.out.println("Invalid Move");
				System.out.println("Re-Enter Your Move");
				continue;
			}
			if (isWin()) {
				displayBoard();
				System.out.println("You Win player : " + player);
				break;
			}
			if (isDraw()) {
				displayBoard();
				System.out.println("The Game is Draw");
				break;
			}
			player = (player == 'X') ? 'O' : 'X';
		}
	}

}

