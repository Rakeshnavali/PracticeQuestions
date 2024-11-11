public class P10_generatefibonacciSeries {
    public static void main(String[] args) {

        int a = 0;
        int b = 1;
        int num = 10;
        System.out.print(a+" "+b+" ");
        for(int i=2; i<num; i++){
            int sum = a + b;
            System.out.print(sum+" ");
            a = b;
            b = sum;
        }
        System.out.println();
        System.out.println();

        //using recursion
        genaratingfibonacci(num);

        
    }
    static int fibonacci(int num){
        if(num==1){
            return 1;
        }
        if(num==0){
            return 0;
        }
        return fibonacci(num-1)+fibonacci(num-2);
    }
    static void genaratingfibonacci(int num){
        for(int i=0; i<num; i++){
            System.out.print(fibonacci(i)+(i<num-1?",":""));
        }
    }
}
