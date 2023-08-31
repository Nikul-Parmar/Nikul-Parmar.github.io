package Arrayys;

import java.util.Scanner;

public class arrayRotation {
    public static int[] reverseArray(int[] arr, int l, int r) {
        r--;
        while (l < r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
        return arr;
    }

    public static int[] rotateArray(int[] a, int x, String dir) {
        int n = a.length;
        if (dir.equals("LEFT")) {
            reverseArray(a, 0, n);
            if (x > n) {
                x = x % n;
            }
            reverseArray(a, 0, n - x);
            reverseArray(a, n - x, n);
        }
        if (dir.equals("RIGHT")) {
            reverseArray(a, 0, n);
            if (x > n) {
                x = x % n;
            }
            reverseArray(a, 0, x);
            reverseArray(a, x, n);
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int t = sr.nextInt();
        while (t > 0) {
            int n = sr.nextInt();
            int x = sr.nextInt();
            String dir = sr.next();
            int ar[] = new int[n];
            for (int i = 0; i < n; i++) {
                ar[i] = sr.nextInt();
            }
            ar = rotateArray(ar, x, dir);
            int index = 0;
            for (int i = 0; i < n; i++) {
                System.out.print(ar[i] + " ");
            }
            System.out.println();

            t = t - 1;
        }
    }
}
