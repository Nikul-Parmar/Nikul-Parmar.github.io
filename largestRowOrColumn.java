package Arrays2D;

public class largestRowOrColumn {
    public static void findLargest(int mat[][]) {
        // Your code goes here
        boolean isRow = true;
        int largestSum = Integer.MIN_VALUE;
        int rows = mat.length;
        int index = 0;
        if (rows == 0) { // for blank array
            System.out.println("row " + index + " " + largestSum);
            return;
        }
        int cols = mat[0].length;
        // Program to calculate RowSum
        for (int i = 0; i < rows; i++) {
            int rowSum = 0;
            for (int j = 0; j < cols; j++) {
                rowSum = rowSum + mat[i][j];
            }
            if (rowSum > largestSum) {
                largestSum = rowSum;
                index = i;
            }
        }
        // Program to Calculate ColumnSum
        for (int j = 0; j < cols; j++) {
            int colSum = 0;
            for (int i = 0; i < rows; i++) {
                colSum = colSum + mat[i][j];
            }
            if (colSum > largestSum) {
                largestSum = colSum;
                index = j;
                isRow = false; // to show colSum is greater than RowSum
            }
        }
        // Now check which has higher sum row or column
        if (isRow) {
            System.out.println("row " + index + " " + largestSum);
        } else {
            System.out.println("column " + index + " " + largestSum);
        }
    }

    // main code to check the solution code
    public static void main(String[] args) {
        int mat[][] = { { 1, 1 }, { 1, 1 } };
        findLargest(mat); // ouput row 0 2

    }
}
