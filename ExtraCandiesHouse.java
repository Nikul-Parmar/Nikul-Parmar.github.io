package Arrayys;

// There are ‘N’ houses. Two persons ‘P1’ and ‘P2’ 
// distribute some candies to all these houses.
// You are given an integer, ‘X’. If the total 
// number of candies received by any house is more 
// than ‘X’, it will pass the rest of the candies to 
// the next house to the right. The rightmost house 
// will just throw the extra candies.
// You must return an array of ‘N’ integers denoting t
// he final number of candies for all the houses.

// Sample Input 
// 1
// 6 17
// 22 8 4 7 5 10
// 9 3 1 6 0 9

// Sample Output 
// 17 17 13 13 5 17 

public class ExtraCandiesHouse {
    public static int[] extraCandies(int n, int x, int[] p1, int[] p2) {
        int carry = 0, i = 0, j = 0;
        int[] output = new int[n];
        while (i < n) {
            int sum = p1[i] + p2[j] + carry;
            if (sum > x) {
                output[i] = x;
                carry = sum - x;
            } else {
                output[i] = sum;
                carry = 0;
            }
            i++;
            j++;
        }
        return output;
    }
}
