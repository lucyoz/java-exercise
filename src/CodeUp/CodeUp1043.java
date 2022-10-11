package CodeUp;

import java.util.Scanner;

public class CodeUp1043 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int a = num1%num2;

        System.out.println(a);
    }
}
