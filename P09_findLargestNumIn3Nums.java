public class P09_findLargestNumIn3Nums {
    public static void main(String[] args) {
        int a=10,b=20,c=30;

        //logic 1: using if else conditions
        if(a>b && a>c){
            System.out.println(a+" is a largest number");
        }else if(b>a && b>c){
            System.out.println(b+" is a largets number");
        }else{
            System.out.println(c+" is a largest number");
        }


        //logic 2: using multiple turnary operators
        int largest1 = a>b?a:b;
        int largest2 = c>largest1?c:largest1;
        System.out.println(largest2+" is the largest number");


        //logic 3: by writing a turnary operators in one line
        int largest = c>(a>b?a:b)?c:(a>b?a:b);
        System.out.println(largest+" is the largest number");
    }
}
