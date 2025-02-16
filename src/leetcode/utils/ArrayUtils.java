package leetcode.utils;

import java.util.Arrays;

public class ArrayUtils {
    // Method to print an array in a formatted way
    public static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    // Method to reverse an array
    public static void reverseArray(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
