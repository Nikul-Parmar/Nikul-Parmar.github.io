package Arrayys;

import java.util.Arrays;
import java.util.Scanner;

public class findSmallerElementInAnotherArray {
    public static int[] countS(int n, int m, int[] a, int[] b) {
        Arrays.sort(b);
        int[] result = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            int left = 0;
            int right = b.length - 1;
            int count = -1;

            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (b[mid] <= a[i]) {
                    count = mid;
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

            if (count == -1) {
                result[i] = 0;
            } else {
                result[i] = count + 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int t = sr.nextInt();
        while (t > 0) {
            int n = sr.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sr.nextInt();
            }
            int m = sr.nextInt();
            int b[] = new int[m];
            // int index=0;
            for (int i = 0; i < m; i++) {
                b[i] = sr.nextInt();
            }
            int ans[] = new int[n];
            ans = countS(n, m, a, b);
            for (int i = 0; i < n; i++) {
                System.out.print(ans[i] + " ");
            }
            System.out.println();

            t = t - 1;
        }
    }
}
