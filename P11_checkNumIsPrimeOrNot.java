/*
 * rule1: number should more greater than 0.
 * rule2: that number is divisible by only 1 and itself. 
 * 
 */
public class P11_checkNumIsPrimeOrNot {
    public static void main(String[] args) {
        int num = 37;
        if(num>0){
            int count =0;
            for(int i=1; i<=num; i++){
                if(num%i==0){
                    count++;
                }
            }
            if(count==2){
                System.out.println("yes, "+num+" is a prime number");
            }else{
                System.out.println("No, "+num+" is not prime number");
            }
        }else{
            System.out.println("its not a prime number");
        }
    }
}
