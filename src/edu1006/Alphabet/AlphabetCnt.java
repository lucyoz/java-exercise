package edu1006.Alphabet;

import java.util.HashMap;
import java.util.Locale;

public class AlphabetCnt {

    //알파벳인지 아닌지 boolean으로 return ( 아스키코드 이용 -> 그저 char로 비교할 수도 있음)
    public boolean isAlphabet(char c){
        if ((c >= 65 && c<=90) || (c >=97 && c<=122) ){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String s1 = "aabbcd```cdd??ee///ffjjkkkll";
        s1 = s1.toUpperCase();
        AlphabetCnt alphabetCnt = new AlphabetCnt();

        HashMap<Character, Integer> alphabetMap = new HashMap<>();
        for(char c = 'A';c<'Z';c++){
            alphabetMap.put(c, 0);
        }

        // String을 한글자씩 출력할 수 있어야 한다.
        for(int i=0;i<s1.length();i++){
            char c1 = s1.charAt(i);
            boolean isAlphabet = alphabetCnt.isAlphabet(c1);
            if(isAlphabet){
                //여기에서 개수를 센다

                alphabetMap.put(c1, alphabetMap.get(c1)+1);

            }
        }

        System.out.println(alphabetMap);

    }
}
