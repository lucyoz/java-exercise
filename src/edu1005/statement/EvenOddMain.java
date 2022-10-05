package edu1005.statement;

import edu1005.calculator.EvenOdd;

public class EvenOddMain {
    public static void main(String[] args) {
        EvenoddKorean evenoddkorean = new EvenoddKorean(3);
        EvenOdd evenOdd = new EvenOdd(evenoddkorean);
        //System.out.println(evenOdd.getWord());

        EvenOddEnglish evenOddEnglish = new EvenOddEnglish(3);
        System.out.println(evenOddEnglish.getWord());

    }

}
