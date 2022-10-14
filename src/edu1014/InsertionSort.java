package edu1014;

import java.util.Arrays;

public class InsertionSort {
    public int[] sort(int[] arr){
        int i, j;

        for(i=1;i<arr.length;i++){
            int value = arr[i];
            for(j=i-1;j>=0&&arr[j]>value;j--){
                arr[j+1] = arr[j];
            }
            arr[j+1] = value;
        }

        return arr;
    }

    public static void main(String[] args) {
        //5에서 출!발! idx = 1
        int[] arr = {8, 5, 6, 2, 4};

        InsertionSort insertionSort = new InsertionSort();
        int[] result = insertionSort.sort(arr);

        System.out.println(Arrays.toString(result));
    }
}
