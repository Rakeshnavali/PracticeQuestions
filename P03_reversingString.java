public class P03_reversingString {
    public static void main(String[] args) {
        String str = "rakesh";
        String rev = "";
        int len = str.length();
        
        
        //->logic 1: using concatination(+)
        System.out.println("Original String:"+str);
        for(int i=len-1; i>=0; i--){
            rev+=str.charAt(i);
        }
        System.out.println("Revesed String Using concatination:"+rev);
        
        
        //logic 2: Using toCharArray method
        System.out.println("Original String:"+str);
        rev = "";
        char arr[] = str.toCharArray();
        for(int i=arr.length-1; i>=0; i--){
            rev+=str.charAt(i);
        }
        System.out.println("Revesed String Using toCharArray method:"+rev);
        


        //->logic 3: using stringBuffer
        System.out.println("Original String:"+str);
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        rev = sb.toString();
        System.out.println("Revesed String Using StringBuffer:"+rev);


        //->logic 3: using stringBuilder
        System.out.println("Original String:"+str);
        StringBuilder sbl = new StringBuilder(str);
        sbl.reverse();
        rev = sbl.toString();
        System.out.println("Revesed String Using concatination:"+rev);

        System.out.println(sbl.getClass());
    }
}
