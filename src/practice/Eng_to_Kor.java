package practice;

import java.util.Arrays;
import java.util.Scanner;

public class Eng_to_Kor {
    //연습문제
    /*
    영어와 한글의 짝을 이루는 2개의 배열을 만들고, 사용자로부터 영어 단어를 입력 받아 한글을 출력하는 프로그램을 작성하라.
    " exit"을 입력하면 프로그램을 종료하라.
    String eng[] = { "student" , "love" , "java" , "happy" , "future" };
    String kor[] = { "학생" , "사랑" , "자바" , "행복" , "미래" };
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String eng[] = { "student" , "love" , "java" , "happy" , "future" };
        String kor[] = { "학생" , "사랑" , "자바" , "행복" , "미래" };
        String word = "";
        int index = -1;

        System.out.println("다음 단어중에 하나를 입력해주세요. " + Arrays.toString(eng));
        word = scanner.nextLine(); // word에 단어를 입력 받는다.


        for(int i=0;i<eng.length;i++){
            if(word.equals(eng[i])){
                index = i;
                break;
            }
        }

        if (index==-1){
            System.out.println("없음");
        } else {
            System.out.println(kor[index]);

        }




        //  int index = Arrays.binarySearch(eng, word);
        //  System.out.println(kor[index]);




    }
}