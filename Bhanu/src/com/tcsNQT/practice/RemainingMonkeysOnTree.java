package com.tcsNQT.practice;

import java.util.Scanner;

public class RemainingMonkeysOnTree {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int mon = sc.nextInt(), mB = sc.nextInt(), mP = sc.nextInt(), ban = sc.nextInt(), pea = sc.nextInt();
		if (mon < 0 || mB < 0 || mP < 0 || ban < 0 || pea < 0) {
			System.out.println("Invalid Input");
		} else {
			int banAte = ban / mB;
			int peaAte = pea / mP;
			mon -= banAte + peaAte;
		}
		System.out.println("Number of Monkeys Left on the tree: " + mon);
		sc.close();
	}
}
