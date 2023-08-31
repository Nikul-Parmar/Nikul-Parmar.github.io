package Strings;

import java.util.Scanner;

public class compressTheString {
    public static String getCompressedString(String str) {
        int len = str.length();
        String result = "";
        int count = 1;
        char previousChar = str.charAt(0);
        for (int i = 1; i < len; i++) {
            char currentChar = str.charAt(i);
            if (currentChar == previousChar) {
                count++;
            } else {
                result += previousChar;
                if (count > 1) {
                    result += count;
                }
                previousChar = currentChar;
                count = 1;
            }
        }
        result += previousChar;
        if (count > 1) {
            result += count;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        String str = sr.nextLine();
        String ans = getCompressedString(str);
        System.out.println(ans);

    }
}
