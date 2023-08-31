package Arrays2D;

import java.util.Arrays;
import java.util.Scanner;

public class queryAndMatrix {
    public static int[] processQueries(int[][] matrix, String[] queries) {
        int M = matrix.length;
        int N = matrix[0].length;
        int Q = queries.length;

        int[] output = new int[Q];
        int outputIndex = 0;

        for (int q = 0; q < Q; q++) {
            String[] parts = queries[q].split("");
            int queryType = Integer.parseInt(parts[0]);
            String rowOrCol = parts[1];
            int index = Integer.parseInt(parts[2]);

            if (queryType == 1) {
                if (rowOrCol.equals("R")) {
                    for (int i = 0; i < N; i++) {
                        matrix[index][i] = 1 - matrix[index][i];
                    }
                } else if (rowOrCol.equals("C")) {
                    for (int i = 0; i < M; i++) {
                        matrix[i][index] = 1 - matrix[i][index];
                    }
                }
            } else if (queryType == 2) {
                int count = 0;
                if (rowOrCol.equals("R")) {
                    for (int i = 0; i < N; i++) {
                        if (matrix[index][i] == 0) {
                            count++;
                        }
                    }
                } else if (rowOrCol.equals("C")) {
                    for (int i = 0; i < M; i++) {
                        if (matrix[i][index] == 0) {
                            count++;
                        }
                    }
                }
                output[outputIndex++] = count;
            }
        }

        return Arrays.copyOf(output, outputIndex);
    }

    public static int[] query(int[][] mat, int m, int n, String[] q) {
        int[] output = processQueries(mat, q);
        return output;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        while (T-- > 0) {
            int M = scanner.nextInt();
            int N = scanner.nextInt();
            int[][] matrix = new int[M][N];
            int Q = scanner.nextInt();
            scanner.nextLine();

            String[] queries = new String[Q];
            for (int i = 0; i < Q; i++) {
                queries[i] = scanner.nextLine();
            }

            int[] result = query(matrix, M, N, queries);

            for (int count : result) {
                System.out.print(count + " ");
            }
            System.out.println();
        }
    }
}
