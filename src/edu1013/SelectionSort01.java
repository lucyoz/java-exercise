package edu1013;

import java.util.Arrays;

public class SelectionSort01 {
    //가장 작은 숫자를 0번째에
    public int[] sort1(int[] arr){
        int minI = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[minI]>arr[i]){
                minI = i;
            }
        }

        if (arr[minI] != arr[0]){
            int tmp = arr[0];
            arr[0] = arr[minI];
            arr[minI] = tmp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{7, 2, 3, 9, 28, 11};

        SelectionSort01 selectionSort01 = new SelectionSort01();
        int[] result = selectionSort01.sort1(arr);

        System.out.println(Arrays.toString(result));

    }
}