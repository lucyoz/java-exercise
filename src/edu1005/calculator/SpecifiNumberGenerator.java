package edu1005.calculator;

public class SpecifiNumberGenerator implements  NumberGenerator{
    @Override
    public int generate(int num){
        return 2000 * num;
    }
}
