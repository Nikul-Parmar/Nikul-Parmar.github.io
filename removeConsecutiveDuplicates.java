package Strings;

import java.util.Scanner;

public class removeConsecutiveDuplicates {
    public static String removeConsecutiveDuplicates(String str) {
        int i = 0, j = 0;
        String ans = "";
        while (j < str.length()) {
            if (str.charAt(i) == str.charAt(j)) {
                j++;
            } else if (str.charAt(i) != str.charAt(j) || j == str.length() - 1) {
                ans += str.charAt(i);
                i = j;
                j++;
            }

        }
        ans += str.charAt(j - 1);
        return ans;
    }

    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        String str = sr.nextLine();
        String ans = removeConsecutiveDuplicates(str);
        System.out.println(ans);

    }
}
