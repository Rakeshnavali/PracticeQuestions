public class P06_countNumOfDigitsInNum {
    public static void main(String[] args) {
        int num = 15246;
        int OriginalNum = num;
        int count=0;
        while(num>0){
            count++;
            num/=10;
        }
        System.out.println(count+" digits are presents in "+OriginalNum);
    }
}
