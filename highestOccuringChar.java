package Strings;

import java.util.Scanner;

public class highestOccuringChar {

    public static char highestOccuringChar(String str) {
        int len = str.length();
        int[] fr = new int[256];
        for (int i = 0; i < len; i++) {
            fr[str.charAt(i)]++;
        }
        int max = -1;
        char result = ' ';
        for (int j = 0; j < len; j++) {
            if (fr[str.charAt(j)] > max) {
                max = fr[str.charAt(j)];
                result = str.charAt(j);
            }
        }
        for (int k = 0; k < len; k++) {
            if (str.charAt(k) == max) {
                result = str.charAt(k);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        String str = sr.nextLine();
        char ans = highestOccuringChar(str);
        System.out.println(ans);

    }
}
