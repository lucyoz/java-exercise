package CodeUp;

import java.util.Scanner;

public class CodeUp1033 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        String hexa = Integer.toHexString(num);
        System.out.println(hexa.toUpperCase());
    }
}
