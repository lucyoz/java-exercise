public class CureencyCnt {
    public static void main(String[] args) {
        int curr50000 = 50000;
        int curr10000 = 10000;
        int curr5000 = 5000;
        int curr1000 = 1000;
        int curr500 = 500;
        //raw 익히지 않은
        int refund = 25000;

        //25,000원을 각 화폐 단위로 나누었을 때 몫과 나머지를 출력하는 코드를 작성해주세요
        //각 화폐 단위는 위와 같이 각각 변수로 선언해주세요.
        System.out.println(refund+"원");
        System.out.println("50000원 몫: "+refund/curr50000+ " 나머지:"+refund%curr50000);

        System.out.println("10000원: "+refund/curr10000+ " 나머지:"+refund%curr10000);

        System.out.println("5000원: "+refund/curr5000+ " 나머지:"+refund%curr5000);

        System.out.println("1000원: "+refund/curr1000+ " 나머지:"+refund%curr1000);

        System.out.println("500원: "+refund/curr500+ " 나머지:"+refund%curr500);
    }
}
