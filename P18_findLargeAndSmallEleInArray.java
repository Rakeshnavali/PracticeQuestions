public class P18_findLargeAndSmallEleInArray {
    public static void main(String[] args) {
        int arr[] = {10,43,52,35,63,73,67};
        int max = arr[0];
        int min = arr[0];
        for(int i=1; i<arr.length-1; i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("minimum num:"+min+"\n"+"maximum num:"+max);
        
        
        //using inbuit method
        int ar[]={12,34,23,44,34,64};
        int min1 = ar[0],max1 = ar[0];
        for(int i=0; i<ar.length; i++){
             min1 = Math.min(ar[i], min1);
             max1 = Math.max(ar[i], max1);
        }
        System.out.println("minimum num:"+min1+"\n"+"maximum num:"+max1);
        
    }
}
