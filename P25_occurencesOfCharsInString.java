public class P25_occurencesOfCharsInString {
    public static void main(String[] args) {
        String str = "this is rakesh";
        int count =0;
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            count++;
        }
        System.out.println(count);
    }
}
