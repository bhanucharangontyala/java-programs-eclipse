package com.tcsNQT.practice;

import java.util.Scanner;
public class StockBuyAndSell {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = Integer.MAX_VALUE, maxProf = 0;
        while(sc.hasNextInt()) {
            int p = sc.nextInt();
            min = Math.min(min, p);
            maxProf = Math.max(maxProf, p - min);
        }
        System.out.println(maxProf);
        sc.close();
    }
}