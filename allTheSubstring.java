package Strings;

import java.util.Scanner;

public class allTheSubstring {

    public static void printSubstrings(String str) {
        int n = str.length();
        for (int k = 0; k < n; k++) {
            for (int i = k; i < n; i++) {
                for (int j = k; j <= i; j++) {
                    System.out.print(str.charAt(j));
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        String str = sr.next();

        printSubstrings(str);

    }
}
