package edu1012;

import java.util.Scanner;

public class MaxPoly {
    public int getMax(int[] arr){
        int maxI = 0;
        for(int i=0;i<arr.length;i++){
            if (arr[maxI]<arr[i]) maxI = i;

        }
        return maxI;
    }
    public int getMin(int[] arr){
        int minI = 0;
        for(int i=0;i<arr.length;i++){
            if (arr[minI] > arr[i]) minI = i;

        }
        return minI;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];

        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        MaxPoly maxPoly = new MaxPoly();
        int idx = maxPoly.getMax(arr);

        System.out.println(arr[idx]);
        System.out.println(idx+1);
    }
}
