public class P21_binarySearchingInArray {
    public static void main(String[] args) {
        int arr[] = {10,23,43,54,64,64};
        int key = 54;
        int left = 0, right=arr.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]==key){
                System.out.println(key +" is found at the index of "+mid);
                return;
            }
            else if(key>arr[mid]){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        System.out.println(key+" is not conatain in an array.");
    }
}
