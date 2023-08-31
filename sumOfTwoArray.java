package Arrayys;

import java.util.Scanner;

public class sumOfTwoArray {
    public static void sumOfTwoArrays(int arr1[], int arr2[], int output[]) {
        int k = output.length, carry = 0, a = arr1.length, b = arr2.length, sum = 0, i = a - 1, j = b - 1;
        if (a > b) {
            i = a - 1;
            j = b - 1;
            k = a;
            while (i >= 0 && j >= 0) {
                sum = arr1[i] + arr2[j] + carry;
                carry = sum / 10;
                output[k] = sum % 10;
                i--;
                j--;
                k--;

            }
            while (i >= 0) {
                sum = arr1[i] + carry;
                carry = sum / 10;
                output[k] = sum % 10;
                i--;
                k--;
            }

        }
        if (a < b) {
            k = output.length;
            i = a - 1;
            j = b - 1;
            k = b;
            while (i >= 0 && j >= 0) {
                sum = arr1[i] + arr2[j] + carry;
                carry = sum / 10;
                output[k] = sum % 10;
                i--;
                j--;
                k--;

            }
            while (j >= 0) {
                sum = arr1[i] + carry;
                carry = sum / 10;
                output[k] = sum % 10;
                i--;
                k--;
            }

        }
        if (a == b) {
            i = a - 1;
            j = b - 1;
            k = b;
            while (i >= 0 && j >= 0) {
                sum = arr1[i] + arr2[j] + carry;
                carry = sum / 10;
                output[k] = sum % 10;
                i--;
                j--;
                k--;
                if (k == 0) {
                    output[k] = carry;
                }
            }
        }

    }

    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int t = sr.nextInt();
        while (t > 0) {
            int n = sr.nextInt();
            int ar1[] = new int[n];
            for (int i = 0; i < n; i++) {
                ar1[i] = sr.nextInt();
            }
            int m = sr.nextInt();
            int ar2[] = new int[m];
            for (int i = 0; i < m; i++) {
                ar2[i] = sr.nextInt();
            }

            int output[] = new int[Math.max(n, m) + 1];
            sumOfTwoArrays(ar1, ar2, output);
            for (int i = 0; i < output.length; i++) {
                System.out.print(output[i] + " ");
            }
            System.out.println();
            t = t - 1;
        }
    }
}
