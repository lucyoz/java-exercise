package CodeUp;

import java.util.Scanner;

public class CodeUp1023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Num = sc.nextLine();

        String[] strArr = Num.split("\\.");

        System.out.println(strArr[0]);
        System.out.println(strArr[1]);
    }
}
