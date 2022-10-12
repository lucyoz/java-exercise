package CodeUp;

import java.util.Scanner;

public class CodeUp1058 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int b = sc.nextInt();
        int a = sc.nextInt();


        if(a==b && b==0){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}
