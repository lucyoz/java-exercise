public class CodeUp1155 {
    private int multipleTargetNum = 2;
    public CodeUp1155(){
        this.multipleTargetNum = multipleTargetNum;
    }

    public String getEvenOdd(int num){
        if (num % this.multipleTargetNum == 0){
            return "multiple";
        }
        return "not multiple";
    }
}
