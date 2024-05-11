package main;

import java.util.Arrays;

public class Main {
    public static int countElementsEqualToIndex(int[] arr, int i) {
        if (arr.length == 1) {
            if (arr[0] == i) {
                return 1;
            } else {
                return 0;
            }
        }

        int mid = arr.length / 2;
        int left = i;
        int right = i + mid;

        return countElementsEqualToIndex(Arrays.copyOfRange(arr, mid, arr.length), right) +
                countElementsEqualToIndex(Arrays.copyOfRange(arr, 0, mid), left);
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 4, 5};
        System.out.println("Number of elements equal to their index: " + countElementsEqualToIndex(arr, 0));
    }
}