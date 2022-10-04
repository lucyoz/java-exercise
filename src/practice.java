import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        System.out.println("금액을 입력하세요");
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();
        int[] unit = {50000, 10000, 5000, 1000, 500, 100, 10};
        int k = 0;
        int i = 0;

        while(money>0){
            k = money / unit[i];
            money %= unit[i];
            System.out.println(unit[i] + "원? "+k+"개");
            i++;
        }

    }
}
