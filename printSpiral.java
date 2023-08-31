package Arrays2D;

public class printSpiral {
    public static void printSpiral(int[][] arr) {
        int n = arr.length;
        if (n == 0) {
            return;
        }
        int m = arr[0].length;
        int total = n * m, count = 1;
        int upperCol = 0, upperRow = 0, lowerCol = m - 1, lowerRow = n - 1;
        while (count <= total) {
            for (int i = upperCol; i <= lowerCol && count <= total; i++) {

                System.out.print(arr[upperCol][i] + " ");
                count++;
            }
            upperRow++;
            for (int j = upperRow; j <= lowerRow && count <= total; j++) {

                System.out.print(arr[j][lowerCol] + " ");
                count++;
            }
            lowerCol--;
            for (int k = lowerCol; k >= upperCol && count <= total; k--) {

                System.out.print(arr[lowerRow][k] + " ");
                count++;
            }
            lowerRow--;
            for (int p = lowerRow; p >= upperRow && count <= total; p--) {

                System.out.print(arr[p][upperCol] + " ");
                count++;
            }
            upperCol++;

        }

    }

    public static void spiralPrint(int arr[][]) {

        printSpiral(arr);
    }

    
}
