package edu1005;

public class RandomCalMain {

    public static void main(String[] args) {
        RandomCalculator randomCalculator = new RandomCalculator(10);


        randomCalculator.plus();
        System.out.println();

        randomCalculator.minus();
        System.out.println();

        randomCalculator.multiple();
        System.out.println();

        randomCalculator.divide();
    }
}
