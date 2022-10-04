import java.util.Scanner;

public class EvenOdd2 {
    private String getEvenOdd(int num){
        if(num%2 == 0){
            return "짝수";
        } else {
            return "홀수";
        }
    }

    public void printEvenOddStatement(int first, int second){
        System.out.printf("%s+%s=%s", getEvenOdd(first),getEvenOdd(second),
                getEvenOdd(first+second));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        EvenOdd2 evenodd = new EvenOdd2();
        evenodd.printEvenOddStatement(n1, n2);
    }
}
