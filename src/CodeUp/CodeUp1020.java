package CodeUp;

import java.util.Scanner;

public class CodeUp1020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String[] strArr = str.split("-");
        System.out.println(strArr[0]+strArr[1]);
    }
}
