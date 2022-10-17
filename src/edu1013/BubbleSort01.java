package edu1013;

import java.util.Arrays;

public class BubbleSort01 {

    public int[] sort1(int[] arr){
        for(int i=0;i<arr.length-1;i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{7, 2, 3, 9, 28, 11};

        BubbleSort01 selectionSort01 = new BubbleSort01();
        int[] result = selectionSort01.sort1(arr);

        System.out.println(Arrays.toString(result));

    }
}
