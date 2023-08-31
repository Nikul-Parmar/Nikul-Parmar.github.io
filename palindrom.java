package Strings;

import java.util.Scanner;

public class palindrom {

    public static boolean isPalindrome(String str) {

        boolean flg = false;
        int j = str.length() - 1;
        for (int i = 0; i < str.length(); i++, j--) {
            if (str.charAt(i) == str.charAt(j)) {
                flg = true;
            } else if (str.charAt(i) != str.charAt(j)) {
                flg = false;
                break;
            }
            if (i == str.length() / 2) {
                break;
            }
        }
        return flg;
    }

    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        String str = sr.nextLine();
        boolean ans = isPalindrome(str);
        System.out.println(ans);
    }
}
