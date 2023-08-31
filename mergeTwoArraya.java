package Arrayys;

import java.util.Scanner;

// Sample Input
// 1
// 6
// 1 3 6 11 12 17 
// 5
// 2 8 12 16 19 
// Sample output
// 1 2 3 6 8 11 12 12 16 17 19

public class mergeTwoArraya {
    public static int[] merge(int arr1[], int arr2[]) {
        int m = arr1.length, n = arr2.length, i = 0, j = 0, k = 0;
        int arr[] = new int[m + n];
        while (i < m && j < n) {
            if (arr1[i] <= arr2[j]) {
                arr[k] = arr1[i];
                i++;
                k++;
            } else {
                arr[k] = arr2[j];
                j++;
                k++;
            }
        }
        while (i < m) {
            arr[k] = arr1[i];
            i++;
            k++;
        }
        while (j < n) {
            arr[k] = arr2[j];
            j++;
            k++;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t > 0) {
            int n = sc.nextInt();
            int[] arr1 = new int[n];
            for (int i = 0; i < n; i++) {
                arr1[i] = sc.nextInt();
            }
            int m = sc.nextInt();
            int[] arr2 = new int[m];
            for (int i = 0; i < m; i++) {
                arr2[i] = sc.nextInt();
            }
            int[] ans = new int[m + n];
            ans = merge(arr1, arr2);
            for (int i = 0; i < m + n; i++) {
                System.out.print(ans[i] + " ");
            }
            System.out.println();
            t -= 1;
        }

    }
}
