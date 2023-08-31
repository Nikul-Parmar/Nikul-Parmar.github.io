package Arrays2D;

import java.util.Scanner;

public class totalSumOfBoundries {
    public static void totalSum(int[][] mat) {
        int n = mat.length;
        if (n == 0) {
            System.out.print(0);
            return;
        }
        int m = mat[0].length;
        int Sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == j || (i + j) == n - 1) {
                    Sum += mat[i][j];
                } else if (i == 0 || j == 0 || i == n - 1 || j == m - 1) {
                    Sum += mat[i][j];
                }
            }
        }
        System.out.println(Sum);

    }

    public static void main(String args[]) {
        int t, N, M;
        Scanner sr = new Scanner(System.in);
        t = sr.nextInt();
        for (int k = 0; k < t; ++k) {
            N = sr.nextInt();
            int ar[][] = new int[N][N]; // Swap n and m in array dimensions
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    ar[i][j] = sr.nextInt();
                }
            }
            totalSum(ar);
        }
    }
}
