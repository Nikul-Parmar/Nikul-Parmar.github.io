package Arrayys;

import java.util.Scanner;

// You are given an integer array/list(ARR) of size N. 
// It contains only 0s, 1s and 2s. Write a solution to sort 
// this array/list in a 'single scan'.

public class sort012 {
    public static void sort012(int[] arr, int n) {
        n = arr.length;
        int i = 0, nz = 0, nt = arr.length - 1, temp;
        while (i <= nt) {
            if (arr[i] == 2) {
                temp = arr[i];
                arr[i] = arr[nt];
                arr[nt] = temp;
                nt--;
            }
            if (arr[i] == 1) {
                i++;
            }
            if (arr[i] == 0) {
                temp = arr[i];
                arr[i] = arr[nz];
                arr[nz] = temp;
                nz++;
                i++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t > 0) {
            int n = s.nextInt();
            int arr[] = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = s.nextInt();
            }
            sort012(arr, n);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            t -= 1;
        }

    }
}
