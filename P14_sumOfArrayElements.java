public class P14_sumOfArrayElements {
    public static void main(String[] args) {
        int arr[] = {1,6,7,5,8};



        //-> using for loop
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        System.out.println("using for loop sum is "+sum);


        //using foreach or enhaced loop
        sum =0; 
        for(int ele:arr){
            sum+=ele;
        }
        System.out.println("using foreach loop sum is "+sum);
    }
}
