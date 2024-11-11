import java.util.Arrays;

public class P16_checkArraysareEqualOrNot {
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5};
        int arr2[] = {1,2,3,4,5,};

        //Approch 1
        boolean flag = Arrays.equals(arr1, arr2);
        if(flag==true){
            System.out.println("The arrays conatins same elements.");
        }else{
            System.out.println("both the arrays are not same");
        }


        //Approch 2
        boolean flag2 = true;
        if(arr1.length==arr2.length){
            for(int i=0; i<arr1.length; i++){
                if(arr1[i]!=arr2[i]){
                    flag=false;
                }
            }
        }else{
            flag2 = false;
        }
        if(flag2==true){
            System.out.println("The arrays conatins same elements.");
        }else{
            System.out.println("both the arrays are not same");
        }
    }
}
