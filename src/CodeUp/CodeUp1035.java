package CodeUp;

import java.util.Scanner;

public class CodeUp1035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String hexa = sc.nextLine();
        int decimal = Integer.parseInt(hexa,16);
        String octal = Integer.toOctalString(decimal);
        System.out.println(octal);
    }
}
