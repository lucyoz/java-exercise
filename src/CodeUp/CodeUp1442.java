package CodeUp;

import edu1014.InsertionSort;

import java.util.Scanner;

public class CodeUp1442 {
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
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        InsertionSort insertionSort = new InsertionSort();
        int[] result = insertionSort.sort(arr);

        for(int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }
    }
}
