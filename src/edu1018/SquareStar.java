package edu1018;

public class SquareStar {
    public void printSquareMatrix(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        SquareStar squareStar = new SquareStar();
        squareStar.printSquareMatrix(5);
    }
}
