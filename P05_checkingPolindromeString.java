//polindrome String is a string that remains the same when its characters are reversed.
//example: madam
public class P05_checkingPolindromeString {
    public static void main(String[] args) {
        String str = "madam";
        String rev = "";
        char arr[] = str.toCharArray();
        for(int i=str.length()-1; i>=0; i--){
            rev+=arr[i];
        }
        if(str.equals(rev)){
            System.out.println("Yes, "+str+" is polindrome number By converting into string and checking original and reversed string");
        }else{
            System.out.println("No, "+str+" is not a polindrome number By By converting into string and checking original and reversed string");
        }
    }
}
