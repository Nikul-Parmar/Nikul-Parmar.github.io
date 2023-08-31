package Arrayys;

import java.util.Scanner;

public class pairWithMinimumDifference {
    public static int smallestDifferencePair(int[] arr1, int n, int[] arr2, int m) {
        int minDiff = Integer.MAX_VALUE, diff = Integer.MIN_VALUE;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                diff = arr1[i] - arr2[j];
                if (diff < 0) {
                    diff = -diff;
                }
                if (diff < minDiff) {
                    minDiff = diff;
                }
            }
        }
        return (minDiff != Integer.MIN_VALUE) ? minDiff : 0;

    }

    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int t = sr.nextInt();
        while (t > 0) {
            int n = sr.nextInt();
            int m = sr.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sr.nextInt();
            }

            int b[] = new int[m];
            // int index=0;
            for (int i = 0; i < m; i++) {
                b[i] = sr.nextInt();
            }
            int ans;
            ans = smallestDifferencePair(a, n, b, m);
            System.out.println(ans);
            t = t - 1;
        }
    }
}
