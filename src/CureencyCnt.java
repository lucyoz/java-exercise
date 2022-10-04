public class CureencyCnt {
    public static void main(String[] args) {
        int curr50000 = 50000;
        int curr10000 = 10000;
        int curr5000 = 5000;
        int curr1000 = 1000;
        int curr500 = 500;
        int curr100 = 100;
        int curr50 = 50;
        int curr10 = 10;

        //raw 익히지 않은
        int refund = 25400;

        //25,000원을 각 화폐 단위로 나누었을 때 몫과 나머지를 출력하는 코드를 작성해주세요
        //각 화폐 단위는 위와 같이 각각 변수로 선언해주세요.
        System.out.println(refund+"원");
        System.out.printf("50000원 몫: %d개 나미저: %d \n",refund/curr50000,refund%curr50000);
        refund %= curr50000;
        System.out.printf("10000원 몫: %d개 나미저: %d \n",refund/curr10000,refund%curr10000);
        refund %= curr10000;
        System.out.printf("5000원 몫: %d개 나미저: %d \n",refund/curr5000,refund%curr5000);
        refund %= curr5000;
        System.out.printf("1000원 몫: %d개 나미저: %d \n",refund/curr1000,refund%curr1000);
        refund %= curr1000;
        System.out.printf("500원 몫: %d개 나미저: %d \n",refund/curr500,refund%curr500);
        refund %= curr500;
        System.out.printf("100원 몫: %d개 나미저: %d \n",refund/curr100,refund%curr100);
        refund %= curr100;

        System.out.printf("50원 몫: %d개 나미저: %d \n",refund/curr50,refund%curr50);
        refund %= curr50;
        System.out.printf("10원 몫: %d개 나미저: %d \n",refund/curr10,refund%curr10);
        refund %= curr10;
    }
}
