public class P07_countNumOfEvenOddDigitsInNum {
    public static void main(String[] args) {
        int num = 145678;
        int OriginalNum = num;
        int evenCount = 0;
        int oddCount = 0;
        while(num>0){
            int digit = num%10;
            if(digit%2==0){
                evenCount++;
            }else{
                oddCount++;
            }
            num/=10;
        }
        System.out.println(evenCount+" Even Numbers and "+oddCount+" Odd Numbers present in "+OriginalNum);
    }
}
