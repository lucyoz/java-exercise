package edu1006.collection;

public class RndAlphabetMain {
    public static void main(String[] args) {

        AlphabetGenerator alphabetGenerator = new AlphabetGenerator();

        char alphabet = alphabetGenerator.generate(0);
        System.out.println(alphabet);
    }
}
