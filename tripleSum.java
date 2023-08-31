package Arrayys;

import java.util.Scanner;

// You have been given a random integer array/list(ARR)
//  and a number X. Find and return the number of triplets 
//  in the array/list which sum to X.

// Sample Input :
// 1
// 7
// 1 2 3 4 5 6 7 
// 12 (sum of 3 elements should be 12)
// Sample Output :
// 5 (There are 5 triplets)

public class tripleSum {

    public static int findTriplet(int[] arr, int x) {
        int sum = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (i != j && j != k && i != k) {
                        if (arr[i] + arr[j] + arr[k] == x) {
                            sum = sum + 1;
                            // System.out.println(arr[i] + " " + arr[j] + " " + arr[k] + " ");
                        }
                    }
                }
            }
        }
        return sum;
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
            int x = sr.nextInt();
            System.out.println((findTriplet(arr, x)));

            t -= 1;
        }
    }

}
