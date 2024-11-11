//polindrome number is a number that remains the same when its digits are reversed.
//example: 16461
public class P04_checkingPolindromeNum {
    public static void main(String[] args) {
        int num = 146541;


        //->logic 1: using algorithm
        int OriginalNum = num;
        int revNum = 0;
        System.out.println("Original num:"+OriginalNum);
        while(num>0){
            revNum = revNum*10+num%10;
            num/=10;
        }
        if(OriginalNum==revNum){
            System.out.println("Yes, "+OriginalNum+" is polindrome number By checking using algorithm");
        }else{
            System.out.println("No, "+OriginalNum+" is not a polindrome number By checking using algorithm");
        }



        //logic 2: by converting into string
        String str = String.valueOf(OriginalNum);
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        String rev = sb.toString();
        if(str.equals(rev)){
            System.out.println("Yes, "+OriginalNum+" is polindrome number By converting into string and checking original and reversed string");
        }else{
            System.out.println("No, "+OriginalNum+" is not a polindrome number By By converting into string and checking original and reversed string");
        }
    }
}
