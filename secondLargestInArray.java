package Arrayys;

import java.util.Scanner;

public class secondLargestInArray {
    public static int secondLargestElement(int[] arr, int n) {
        int l = Integer.MIN_VALUE, sl = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > l) {
                sl = l;
                l = arr[i];
            } else if (arr[i] > sl && arr[i] != l) {
                sl = arr[i];
            }
        }
        if (sl != Integer.MIN_VALUE) {
            return sl;
        }
        return sl;
    }

    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int n = sr.nextInt();
        int ar[] = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = sr.nextInt();
        }
        int ans = secondLargestElement(ar, n);
        System.out.println(ans);
    }
}
