package edu1012;

import java.util.Scanner;

public class CodeUp4596 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[9][9];

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int maxI = 0, maxJ = 0;

        for(int i=0;i<arr.length;i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(arr[maxI][maxJ] < arr[i][j]) {
                    maxI = i;
                    maxJ = j;
                }
            }
        }

        System.out.println(arr[maxI][maxJ]);
        System.out.println((maxI+1)+" "+(maxJ+1));
    }
}
