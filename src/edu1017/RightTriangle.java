package edu1017;

public class RightTriangle {
    public void draw(int n){
        for(int i = 0;i<n;i++){
            for(int j=i;j>=0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        RightTriangle rightTriangle = new RightTriangle();

        rightTriangle.draw(5);
    }

}
