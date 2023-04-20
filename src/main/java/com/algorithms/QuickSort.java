package com.algorithms;

public class QuickSort {

    public static void quicksort(int[] array){
        quicksort(array, 0, array.length - 1);
    }

    public static void quicksort(int[] array, int left, int right) {
        int pivot = array[(left + right) / 2];

        if (left > right){
            return;
        }
        int index = partition(array, left, right, pivot);
        quicksort(array, left, index - 1);
        quicksort(array, index, right);

    }

    private static int partition(int[] array, int left, int right, int pivot) {
        while(left <= right){
            while(array[left] < pivot){
                left++;
            }
            while(pivot > array[right]){
                right--;
            }

            swap(array, left, right);
            left++;
            right--;
        }
        return left;
    }

    public static void swap(int[] array, int left, int right){
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;

    }

}
