package edu1011;

//프로그래머스 자릿수 더하기
import java.util.Scanner;

public class SumOfDigit {
    public int solutionB(int n){
        // n을 String으로 변경
        String str = String.valueOf(n);
        int result = 0;
        for(int i = 0;i<str.length();i++){
            result += Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        // string을 loop돌면서 parseInt후 더한다.

        return result;

    }
    public int solution(int n){
        // % 연산 이용 몫, 나머지
        int result = 0;
        int origin = n;

        while(origin!=0){

            result += origin % 10;
            System.out.printf("%d %d\n", origin, result);
            origin = origin / 10;
        }


        return result;

    }

    public static void main(String[] args) {
        SumOfDigit sod = new SumOfDigit();
        int result1 = sod.solution(1234);

        if (result1 == 10){
            System.out.println("테스트 틍과");
        } else {
            System.out.println("테스트 실패 " + result1);
        }


    }
}
