import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class P19_findingDuplicateEleInArray {
    public static void main(String[] args) {
        int arr[] = {1,3,2,4,3,6,4,5};
        int count =0; 
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
        }
        if(count==0){
            System.out.println("there is no duplicate values in an array");
        }
        System.out.println("yes, this array contain "+ count +" duplicate values");



        //using HashSet
        HashSet<Integer> hs = new HashSet<>();
        int count2 = 0;
        for(int ele:arr){
            if(hs.add(ele)==false){
                count2++;
            }
        }
        if(count2==0){
            System.out.println("there is no duplicate values in an array");
        }
        System.out.println("yes, this array contains "+ count +" duplicate values");


        //using HashMap print duplicate values
        int arr1[] = {1,3,2,4,3,6,4,5};
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int ele:arr1){
            hm.put(ele,hm.getOrDefault(ele, 0)+1);
        }
        for(Map.Entry<Integer,Integer> ele: hm.entrySet()){
            if(ele.getValue()>1){
                System.out.println(ele.getKey());
            }

        }
    }
}
   