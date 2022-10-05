package edu1005.calculator;

public class Calculator3 {
    //NumberCreator
    NumberGenerator numberGenerator;
    int baseNum;

    public Calculator3(NumberGenerator numberGenerator){
        this.numberGenerator = numberGenerator;
        this.baseNum = 10;
    }


    public Calculator3(NumberGenerator numberGenerator, int baseNum){
        this.numberGenerator = numberGenerator;
        this.baseNum = baseNum;
    }

    public void plus(){
        System.out.println(baseNum + numberGenerator.generate(10));
    }

}
