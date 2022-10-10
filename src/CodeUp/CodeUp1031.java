package CodeUp;

import java.util.Scanner;

public class CodeUp1031 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        String octal = Integer.toOctalString(num);
        System.out.println(octal);
    }
}
