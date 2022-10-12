package edu1012;

import java.util.Scanner;

public class CodeUp2081 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];

        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        int maxI = 0;
        for(int i=0;i<arr.length;i++){
            if (arr[maxI]<arr[i]) maxI = i;

        }

        System.out.println(arr[maxI]);
        System.out.println(maxI+1);
    }
}
