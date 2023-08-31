package Arrays2D;

import java.util.Scanner;

public class rowTransversal {
    public static int[] printRowWise(int[][] a) {
        int n = a.length;
        int m = a[0].length;
        int arr[] = new int[n * m];
        int k = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int temp = a[i][j];
                arr[k] = temp;
                if (k == n * m) {
                    break;
                }
                k++;
            }
        }
        return arr;
    }

    public static void main(String args[]) {
        int t, m, n;
        Scanner sr = new Scanner(System.in);
        t = sr.nextInt();
        for (int k = 0; k < t; ++k) {
            n = sr.nextInt();
            m = sr.nextInt();
            int ar[][] = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    ar[i][j] = sr.nextInt();
                }
            }
            int ans[] = new int[n * m];
            ans = printRowWise(ar);
            // System.out.print(ans.length);
            for (int i = 0; i < ans.length; i++) {
                System.out.print(ans[i] + " ");
            }
            System.out.println();

        }
    }
}
