public class P20_linearSearchingInArray {
    public static void main(String[] args) {
        int arr[]={12,34,5,6,4,34,54};
        int num = 4;
        boolean linearSearch = false;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==num){
                linearSearch = true;
            }
        }
        if(linearSearch==true){
            System.out.println("yes num is found in array");
        }else{
            System.out.println("not found");
        }
    }
}
