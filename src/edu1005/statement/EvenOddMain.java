package edu1005.statement;

public class EvenOddMain {
    public static void main(String[] args) {
        EvenoddKorean evenoddkorean = new EvenoddKorean(3);
        System.out.println(evenoddkorean.getWord());

        EvenOddEnglish evenOddEnglish = new EvenOddEnglish(3);
        System.out.println(evenOddEnglish.getWord());

    }

}
