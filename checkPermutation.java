package Strings;

import java.util.Scanner;

public class checkPermutation {
    public static boolean isPermutation(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        int[] fr = new int[128];
        for (char ch : str1.toCharArray()) {
            fr[ch]++;
        }
        for (char ch : str2.toCharArray()) {
            fr[ch]--;
        }
        for (int i : fr) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        String str1 = sr.nextLine();
        String str2 = sr.nextLine();
        boolean ans = isPermutation(str1, str2);

        System.out.println(ans);

    }
}
