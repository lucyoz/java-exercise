package edu1006.Alphabet;

public class AlphabetCnt {
    public static boolean isAlphabet(char c){
        if ((c >= 65 && c<=90) || (c >=97 && c<=122) ){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String s1 = "aabbccddeeffjjkkkll";

        // String을 한글자씩 출력할 수 있어야 한다.
        for(int i=0;i<s1.length();i++){
            System.out.println(s1.charAt(i));
        }

        System.out.println(isAlphabet('Z'));

    }
}
