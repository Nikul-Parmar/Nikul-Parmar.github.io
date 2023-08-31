package Arrayys;

import java.util.Scanner;

public class SwapAlternateElement {

    public static void swapAlternate(int arr[]) {
        int swap = 0;
        int n = arr.length;
        for (int i = 0; i < n - 1; i += 2) {
            swap = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = swap;

        }
    }

    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int t = sr.nextInt();
        while (t > 0) {
            int n = sr.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sr.nextInt();
            }
            swapAlternate(arr);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            t -= 1;
        }
    }
}