package Strings;

import java.util.Scanner;

public class reverseEachWord {

    public static String reverseEachWord(String input) {
        int currentWordStart = 0, i = 0;
        String ans = "";
        for (i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {
                int currentWordEnd = i - 1;
                String reversedWord = "";
                for (int j = currentWordStart; j <= currentWordEnd; j++) {
                    reversedWord = input.charAt(j) + reversedWord;
                }
                ans += reversedWord + " ";
                currentWordStart = i + 1;
            }
        }
        int currentWordEnd = i - 1;
        String reversedWord = "";
        for (int j = currentWordStart; j <= currentWordEnd; j++) {
            reversedWord = input.charAt(j) + reversedWord;
        }
        ans += reversedWord;

        return ans;
    }

    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        String str = sr.nextLine();
        String ans = reverseEachWord(str);

        System.out.println(ans);

    }
}
