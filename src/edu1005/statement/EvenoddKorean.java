package edu1005.statement;

public class EvenoddKorean implements WordMaker{
    private int a;
    public EvenoddKorean(int a){
        System.out.printf("한국어ver ");
        this.a = a;
    }

    @Override
    public String getWord(){
        if(a%2==0){
            return "짝수";
        } else {
            return "홀수";
        }
    }
}
