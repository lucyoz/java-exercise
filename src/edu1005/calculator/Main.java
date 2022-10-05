package edu1005.calculator;

public class Main {
    public static void main(String[] args) {
        NumberGenerator numberGenerator = new RandomNumberGenerator();
        Calculator3 randomNumbercalculator = new Calculator3(numberGenerator);
        randomNumbercalculator.plus();

        Calculator3 specificNumberCalculator = new Calculator3(new SpecifiNumberGenerator());
        specificNumberCalculator.plus();

        randomNumbercalculator = new Calculator3(numberGenerator, 100);
        randomNumbercalculator.plus();
    }

}
