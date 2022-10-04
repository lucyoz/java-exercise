public class CureencyCnt {
    public static void main(String[] args) {
        int curr50000 = 50000;
        int curr10000 = 10000;
        int cur5000 = 5000;
        int cur1000 = 1000;
        int cur500 = 500;
        int refund = 25000;

        System.out.println(refund+"원");
        System.out.println("50000원: "+refund/curr50000);
        refund %= curr50000;
        System.out.println("10000원: "+refund/curr10000);
        refund %= curr10000;
        System.out.println("5000원: "+refund/cur5000);
        refund %= cur5000;
        System.out.println("1000원: "+refund/cur1000);
        refund %= cur1000;
        System.out.println("500원: "+refund/cur500);
    }
}
