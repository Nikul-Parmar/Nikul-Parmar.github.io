package Strings;

import java.util.Scanner;

public class reverseStringWordWise {
    public static String reversedString(String str) {
        int n = str.length();
        int currentWordStart = 0, i = 0;
        String ans = "";
        for (; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                int currentWordEnd = i - 1;
                String reversedWord = "";

                for (int j = currentWordStart; j <= currentWordEnd; j++) {
                    reversedWord = str.charAt(j) + reversedWord;
                }
                ans += reversedWord + " ";
                currentWordStart = i + 1;
            }
        }
        int currentWordEnd = i - 1;
        String reversedWord = "";

        for (int j = currentWordStart; j <= currentWordEnd; j++) {
            reversedWord = str.charAt(j) + reversedWord;
        }
        ans += reversedWord;
        return ans;
    }

    public static String reverseWordWise(String input) {

        String ans = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            ans = ans + input.charAt(i);
        }

        String finalString = reversedString(ans);
        return finalString;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        System.out.println(reverseWordWise(input));
    }
}
