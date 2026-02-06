package com.arrays;

import java.util.Scanner;

public class TicTacToe {

	static char[][] c = { { ' ', ' ', ' ' }, { ' ', ' ', ' ' }, { ' ', ' ', ' ' } };
	static char player = 'X';

	public static void displayboard() {
		System.out.println("-------------");
		for (char[] a : c) {
			System.out.print("| ");
			for (char c1 : a) {
				System.out.print(c1 + " | ");
			}
			System.out.println();
			System.out.println("-------------");
		}
	}

	public static boolean iswin() {
		//for rows
		for (int i = 0; i <= 2; i++) {
			if (c[i][0] == player && c[i][1] == player && c[i][2] == player) {
				return true;
			}
		}
		//for columns
		for (int i = 0; i <= 2; i++) {
			if (c[0][i] == player && c[1][i] == player && c[2][i] == player) {
				return true;
			}
		}
		//for diagonal 1
		if (c[0][0] == player && c[1][1] == player && c[2][2] == player) {
			return true;
		}
		//for diagonal 2
		if (c[0][2] == player && c[1][1] == player && c[2][0] == player) {
			return true;
		}
		return false;
	}

	public static boolean isdraw() {
		for (char[] a : c) {
			for (char a1 : a) {
				if (a1 == ' ') {
					return false;
				}
			}
		}
		return true;
	}
	
	static boolean isValidMove(int row, int col) {
		if (row < 0 || row > 2 || col < 0 || col > 2 || c[row][col] != ' ') {
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		boolean flag = true;
		Scanner sc = new Scanner(System.in);

		while (flag) {
			displayboard();
			System.out.print("enter the row : ");
			int row = sc.nextInt();
			System.out.print("enter the col : ");
			int col = sc.nextInt();

			if (isValidMove(row, col)) {
				c[row][col] = player;
			} else {
				System.out.println("invalid move !!! ");
				System.out.println("select again ");
				continue;
			}

			if (iswin()) {
				System.out.println("=====================================================");
				displayboard();
				System.out.println(player + " you won the game !!!");
				break;
			}
			
			if (isdraw()) {
				displayboard();
				System.out.println("darw  match !!!!");
				break;
			}
			
			player = (player == 'X') ? 'O' : 'X';
		}
		sc.close();
	}

	

}
