class P01_SwappingNums{
    public static void main(String[] args) {
        int a=10,b=20;
        System.out.println("Before Swapping: a="+a+" b="+b);
        //->logic 1: using temp variable
        int temp = a;
        a=b;
        b = temp;
        System.out.println("After Swapping using temp var: a="+a+" b="+b);

        a=10;b=20;
        //->logic 2: uisng + and  - without any temp var
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("After Swapping using + and - : a="+a+" b="+b);




        a=10;b=20;
        //->logic 3: uisng * and  / without any temp var
        a = a*b;
        b = a/b;
        a = a/b;
        System.out.println("After Swapping using * and / : a="+a+" b="+b);
        
        
        
        a=10;b=20;
        //->logic 3: uisng xor operator(^) without any temp var
        a = a^b;
        b = a^b;
        a=a^b;
        System.out.println("After Swapping using XOR OPERATOR : a="+a+" b="+b);



        a=10;b=20;
        //->logic 3: uisng + AND - but writing single line
        b = a+b-(a=b);
        System.out.println("After Swapping using + and - but writing in single line : a="+a+" b="+b);
    }
}