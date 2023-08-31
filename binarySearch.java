package Arrayys;

import java.util.Scanner;

public class binarySearch {

    public static int search(int[] nums, int target) {
        int n = nums.length;
        int s = 0, e = n - 1;
        while (s <= e) {
            int m = (s + e) / 2;
            if (nums[m] < target) {
                s = m + 1;
            } else if (nums[m] > target) {
                e = m - 1;
            } else {
                return m;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        int x = s.nextInt();
        int result = search(arr, x);
        System.out.print(result);
    }
}
