package edu1006.collection;

public class AlphabetGenerator implements Generator<Character>{

    @Override
    public Character generate(int num){
        int rndNum = (int)(Math.random() * 26);
        System.out.println("rndNum "+rndNum);
        return (char)(rndNum+65);

    }
}
