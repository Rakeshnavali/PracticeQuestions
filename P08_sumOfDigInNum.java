public class P08_sumOfDigInNum {
    public static void main(String[] args) {
        int num = 123456;
        int OriginalNum = num;
        int sum =0;
        while(num>0){
            sum+=num%10;
            num/=10;
        }
        System.out.println(sum+" is the sum of digits of "+OriginalNum);
    }
}
