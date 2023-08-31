package Arrayys;

import java.util.Scanner;

// Sample Input 1:
// 10
// 25 34 37 14 48 19 8 27 28 47
// 3 (k=3, so 3rd smallest element)
// Sample Output 1:
// 6

// Bubble Sort.

public class findKthSmallestElement {
    public static int kthSmallest(int[] arr, int n, int k) {
        n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr[k - 1];
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int k = s.nextInt();
        int result = kthSmallest(arr, n, k);
        System.out.print(result);
    }
}
