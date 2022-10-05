package edu1005.statement;

public class EvenOddEnglish implements WordMaker{
    private int a;
    public EvenOddEnglish(int a){
        System.out.printf("EnglishVer ");
        this.a = a;
    }

    @Override
    public String getWord(){
        if(a%2==0){
            return "Even";
        } else {
            return "Odd";
        }
    }
}
