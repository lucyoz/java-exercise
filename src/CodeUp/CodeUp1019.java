package CodeUp;

import java.util.Scanner;

public class CodeUp1019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String[] strArr = str.split("\\.");
        int[] IntArr = new int[3];
        IntArr[0] = Integer.parseInt(strArr[0]);
        IntArr[1] = Integer.parseInt(strArr[1]);
        IntArr[2] = Integer.parseInt(strArr[2]);

        System.out.printf("%04d.%02d.%02d",IntArr[0],IntArr[1],IntArr[2]);
    }
}
