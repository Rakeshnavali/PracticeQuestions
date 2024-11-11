public class P13_findFactorialNum {
    public static void main(String[] args) {
        int num = 4;
        int fact = 1;
        for(int i=1; i<=num; i++){
            fact*=i;
        }
        System.out.println(fact);

        //generating factorial numbers using recursion
        for(int i=1; i<=num; i++){
            System.out.println(factorialUsingRecursion(i));
        }
    }
    static int factorialUsingRecursion(int num){
        if(num == 1){
            return 1;
        }
        return num*factorialUsingRecursion(num-1);
    }
}
