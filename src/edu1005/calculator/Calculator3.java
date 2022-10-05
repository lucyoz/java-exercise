package edu1005.calculator;

public class Calculator3 {
    //NumberCreator
    NumberGenerator numberGenerator;

    public Calculator3(NumberGenerator numberGenerator){
        this.numberGenerator = numberGenerator;
    }

    public void plus(){
        System.out.println(10 + numberGenerator.generate(10));
    }
}
