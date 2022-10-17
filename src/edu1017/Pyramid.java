package edu1017;

public class Pyramid {
    /*
                *
               * *
              * * *
             * * * *
     */
    String str = "*";
    String blank = " ";
    public void printStar(int n){
        for (int i = 0; i < n; i++) {
            //공백 먼저 출력
            for (int j = n-i; j >=0;j--) {
                System.out.print(blank);
            }
            //별 출력
            for (int k = 0; k < 2*i-1; k++) {
                System.out.print(str);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Pyramid pyramid = new Pyramid();
        pyramid.printStar(5);
    }
}
