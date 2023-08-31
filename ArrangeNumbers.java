package Arrayys;

import java.util.Scanner;

// Sample Input 1 :
// 1
// 6
// Sample Output 1 :
// 1 3 5 6 4 2

public class ArrangeNumbers {
    public static void arrange(int[] arr, int n) {
        int s = 0, e = n - 1, val = 1;
        while (val <= arr.length) {
            arr[s] = val;
            val++;
            s++;
            if (e > (n - 1) / 2) {
                arr[e] = val;
            }
            val++;
            e--;
        }

    }

    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int t = sr.nextInt();
        while (t > 0) {
            int n = sr.nextInt();
            int[] arr = new int[n];
            arrange(arr, n);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            t -= 1;
        }
    }
}
