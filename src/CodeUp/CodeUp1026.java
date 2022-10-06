package CodeUp;

import java.util.Scanner;

public class CodeUp1026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String[] strArr = str.split(":");
        int num = Integer.parseInt(strArr[1]);
        System.out.println(num);
    }
}
