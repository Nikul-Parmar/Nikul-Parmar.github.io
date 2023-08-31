package Arrayys;

// Sample Input 
// 5
// 9 3 6 2 0
// Sample Output 
// 0 2 3 6 9

public class insertionSort {
    public static void insertionSort(int[] arr, int size) {
        for (int i = 1; i < size; i++) {
            int j = i - 1, temp = arr[i];
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
    }

}
