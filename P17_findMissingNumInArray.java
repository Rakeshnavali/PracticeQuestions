public class P17_findMissingNumInArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,5};
        int sum =0;
        for(int i=1; i<=5; i++){
            sum += i;
        }
        int arrSum = 0;
        for(int ele:arr){
            arrSum+=ele;
        }
        int missingNum = sum -arrSum;
        System.out.println("missing number in an array is "+missingNum);
    }
}
