package Arrayys;

import java.util.Scanner;

public class findInversion {
    // You have been given an array/list. Your task is to return
    // the number of inversions. Inversions in selection sort refers
    // to difference between the indexes of pairs of
    // elements that are in the wrong order and required swapping.
    
    // Selection sort
    public static int getInversions(int[] arr, int n) {
        int inv = 0;
        for (int i = 0; i < n; i++) {
            int min = Integer.MAX_VALUE, minIndex = -1;
            for (int j = i; j < n; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
            inv = inv + (minIndex - i);
        }
        return inv;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int result = getInversions(arr, n);
        System.out.print(result);
    }
}
