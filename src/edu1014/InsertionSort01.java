package edu1014;

import java.util.Arrays;

public class InsertionSort01 {
    public int[] sort(int[] arr, int i){

        int j = i;
        if(arr[j] < arr[j-1]){
            int tmp = arr[j];
            arr[j] = arr[j-1];
            arr[j-1] = tmp;
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {8, 5, 6, 2, 4};

        InsertionSort01 insertionSort = new InsertionSort01();
        int[] result = insertionSort.sort(arr, 1);

        System.out.println(Arrays.toString(result));
    }
}
