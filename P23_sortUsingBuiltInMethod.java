import java.util.Arrays;
import java.util.Collections;

public class P23_sortUsingBuiltInMethod {
    public static void main(String[] args) {
        int arr[] = {10,23,3,54,4,64};
        System.out.println("Array before sorting: ");
        System.out.println(Arrays.toString(arr));


        //SORTING USING PARALLELSORT METHOD
        System.out.println("Array After sorting Using ParallelSort Method: ");
        Arrays.parallelSort(arr);
        System.out.println(Arrays.toString(arr));

        //SORTING IN DESCENDIG ORDER USING SORT METHOD AND COLLECTIONS.REVERSEORDER METHOD
        Integer arr2[] = {10,23,3,54,4,64};
        System.out.println("Array before sorting: ");
        System.out.println(Arrays.toString(arr2));
        
        System.out.println("Array After sorting Using ParallelSort Method: ");
        Arrays.sort(arr2,Collections.reverseOrder());//collections are not supportable for primitive data type we have make arr as wrapper class
        System.out.println(Arrays.toString(arr2));

    }
}
