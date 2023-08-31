package Arrayys;

import java.util.Scanner;

// You have been given an integer array/list(ARR) of size N. 

// Where N is equal to [2M + 1].
// Now, in the given array/list, 'M' numbers are present 
// twice and one number is present only once.
// You need to find and return that number which is unique 
// in the array/list.

public class findUnique {

    public static int findUnique(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int unique = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    unique = unique + 1;
                }
            }
            if (unique != 2) {
                return arr[i];
            }
        }

        return 0;
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
            System.out.println(findUnique(arr));

            t -= 1;
        }
    }

}
