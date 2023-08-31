package Arrayys;

// You are given the array ‘children’ of size ‘N’ 
// representing the number of candies present at each child.
//  You have a ‘extraCandies’ amount of candies. Your task is 
//  to find for each child if the child has the most candies 
//  among all children if all ‘extraCandies’ are given to the child.
// You have to return a boolean array. ‘True’ is present at position 
// ‘index’ if the child at position ‘index’ will have the maximum amount
//  of candies when given all the ‘extraCandies’ candies.

// For each test case, print an array of boolean values. ‘True’ 
// is present at position ‘index’ if the child at position ‘index’ 
// has the maximum number of candies among all children after receiving 
// extra candies. Otherwise, ‘False’ is present.

public class MaximumCandies {
    public static boolean[] maxCandies(int n, int[] children, int extraCandies) {
        boolean[] result = new boolean[n];
        for (int i = 0; i < n; i++) {
            int y = children[i] + extraCandies;
            for (int j = 0; j < n; j++) {
                if (y < children[j]) {
                    result[i] = false;
                    break;
                } else {
                    result[i] = true;
                }
            }
        }
        return result;
    }

}