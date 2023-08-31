package Arrayys;

import java.util.Scanner;

public class moveAllNegativeNumbers {
    public static int[] separateNegativeAndPositive(int nums[]) {
        int negIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                int temp = nums[i];
                nums[i] = nums[negIndex];
                nums[negIndex] = temp;
                negIndex++;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int t = sr.nextInt();
        while (t > 0) {
            int n = sr.nextInt();
            int ar[] = new int[n];
            for (int i = 0; i < n; i++) {
                ar[i] = sr.nextInt();
            }
            ar = separateNegativeAndPositive(ar);
            int index = -1;
            for (int i = 0; i < n; i++) {
                if (ar[i] >= 0) {
                    index = i;
                    break;
                }
            }
            if (index == -1) {
                System.out.print("Yes");
            } else {
                int flag = 0;
                for (int i = index + 1; i < n; i++) {
                    if (ar[i] < 0) {
                        flag = 1;
                        break;
                    }
                }
                if (flag == 0)
                    System.out.println("Yes");
                else
                    System.out.println("No");
            }

            t = t - 1;
        }
    }
}
