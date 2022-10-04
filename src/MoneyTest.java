import java.util.Scanner;

public class MoneyTest {
    public static void main(String[] args) {
        //현금으로 돈을 받고 거슬러 주어야한다.
        System.out.println("금액을 입력하세요");
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();
        int[] unit = {50000, 10000, 5000, 1000, 500, 100, 10};
        int k = 0;
        int i = 0;
        // 나머지 연산
        // 각 화폐 단위로 나누었을 때의 몫과 나머지를 구하는 문제

        while(money>0){
            k = money / unit[i];
            money %= unit[i];
            System.out.println(unit[i] + "원? "+k+"개");
            i++;
        }





    }
}
