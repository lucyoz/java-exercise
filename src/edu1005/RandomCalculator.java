package edu1005;

public class RandomCalculator implements randomNum{
    private int a;

    public RandomCalculator(int a){
        this.a = a;
    }

    public int random(){
        int r = (int) (Math.random() * 10);
        System.out.println("random숫자:"+r);
        return r;
    }

    public void plus(){
        System.out.println("더하기 연산");
        System.out.print(a+random());
    }
    public void minus(){
        System.out.println("빼기 연산");
        System.out.println(a-random());

    }
    public void multiple(){
        System.out.println("곱하기 연산");
        System.out.println(a*random());

    }
    public void divide(){
        System.out.println("나누기 연산");
        int randomInt = random();
        if(randomInt == 0){
            throw new IllegalArgumentException("/ by 0");
        } else{
            float result = (float) a / randomInt;
            System.out.println(result);
        }

//        try{
//            System.out.println((float)a/ random());
//        } catch (Exception e){
//            e.printStackTrace();
//        }


    }

}
