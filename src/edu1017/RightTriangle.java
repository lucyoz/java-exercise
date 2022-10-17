package edu1017;

public class RightTriangle {
    public static void main(String[] args) {
        String star = "*";

        for(int i=1;i<5;i++){
            for(int j = i; j>0;j--) {
                System.out.print(star);
            }
            System.out.println();
        }
    }

}
