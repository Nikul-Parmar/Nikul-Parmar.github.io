package Arrays2D;

import java.util.Scanner;

public class printLikeWave {
    public static void wavePrint(int mat[][]) {
        int startCol = 0; // Initialize the starting column index
        int n = mat.length; // Get the number of rows in the matrix
        if (n == 0) { // Check if the matrix has no rows
            return; // If so, return early
        }
        int m = mat[0].length; // Get the number of columns in the matrix
        int lastRow = n - 1; // Index of the last row

        // Loop through each column
        while (startCol < m) {

            // Print elements in the current column top to bottom
            for (int i = 0; i < n; i++) {
                System.out.print(mat[i][startCol] + " ");
            }
            startCol++; // Move to the next column

            // Check if there are more columns to process
            if (startCol < m) {
                // Print elements in the current column bottom to top
                for (int j = lastRow; j >= 0; j--) {
                    System.out.print(mat[j][startCol] + " ");
                }
                startCol++; // Move to the next column
            }
        }
    }

    public static void main(String args[]) {
        int t, N, M;
        Scanner sr = new Scanner(System.in);
        t = sr.nextInt();
        for (int k = 0; k < t; ++k) {
            N = sr.nextInt();
            M = sr.nextInt();
            int ar[][] = new int[N][M]; // Swap n and m in array dimensions
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    ar[i][j] = sr.nextInt();
                }
            }
            wavePrint(ar);
            System.out.println();
        }
    }
}
