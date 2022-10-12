package edu1012;

interface Compare{
    boolean doSomething(int valueA, int valueB);
}

public class MaxAndMin {
    private int getMaxOrMin(int[] arr, Compare compare){      //callback
        int targetI = 0;
        for(int i=0;i<arr.length;i++){
            boolean isSth = compare.doSomething(arr[i], arr[targetI]);
            // max인 경우 arr[i] > arr[targetI]
            // min인 경우 arr[i] < arr[targetI]
            if (isSth) {
                targetI = i;
            }

        }
        return targetI;
    }

    public int max(int[] arr){
        return getMaxOrMin(arr, new Compare() {
            @Override
            public boolean doSomething(int valueA, int valueB) {
                return valueA > valueB;
            }
        });
    }
    public int min(int[] arr){
        return getMaxOrMin(arr, new Compare() {
            @Override
            public boolean doSomething(int valueA, int valueB) {
                return valueA < valueB;
            }
        });
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3, 29, 38, 12, 57, 74, 40, 85, 61};
        MaxAndMin maxAndMin = new MaxAndMin();
        int maxResult = maxAndMin.max(arr);
        int minResult = maxAndMin.min(arr);
        System.out.println(maxResult);
        System.out.println(minResult);
    }
}
