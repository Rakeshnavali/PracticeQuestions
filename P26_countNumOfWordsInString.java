public class P26_countNumOfWordsInString {
    public static void main(String[] args) {
        String str = "hii this is rakesh";
        int count=0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)==' ' && str.charAt(i+1)!=' '){
                count++;
            }
        }
        System.out.println(count+1);
    }
}
