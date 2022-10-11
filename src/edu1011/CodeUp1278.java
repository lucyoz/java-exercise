package edu1011;

import java.util.Scanner;

public class CodeUp1278 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 0;
        while(n>0){
            n = n / 10;
            cnt++;
        }
        System.out.println(cnt);
    }
}
