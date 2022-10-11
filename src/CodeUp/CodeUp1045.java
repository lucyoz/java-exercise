package CodeUp;

import java.util.Scanner;

public class CodeUp1045 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int plus = num1 + num2;
        int minus = num1 - num2;
        int mult = num1 * num2;
        int division1 = num1 % num2;
        int division2 = num1/num2;
        float division3 = (float)num1 / num2;

        System.out.println(plus);
        System.out.println(minus);
        System.out.println(mult);
        System.out.println(division2);
        System.out.println(division1);
        System.out.printf("%.2f",division3);

    }
}
