package com.algorithms;

public class BinarySearch {
    public static boolean binarySerachIterative(int[] array, int x) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + ((right - left) / 2);
            if (array[mid] == x) {
                return true;
            } else if (array[mid] < x){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }

    public static boolean binarySearchRecursive(int[] array, int x, int left, int right){
        if(left < right){
            return false;
        }

        int mid = (left + right) / 2;

        if (array[mid] == x){
            return true;
        } else if (x < array[mid]){
            return binarySearchRecursive(array, x, left, mid-1);
        } else {
            return binarySearchRecursive(array, x, mid + 1, right);
        }
    }

}
