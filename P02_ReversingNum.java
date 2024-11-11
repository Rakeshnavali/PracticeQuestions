public class P02_ReversingNum {
    public static void main(String arrgs[]){
        int num = 1024;
        System.out.println("The Original num:"+num);

        //->logic 1: using algorithm
        int rev = 0;
        while(num>0){
            rev = rev*10+num%10;
            num/=10;
        }
        System.out.println("the reverse num using algorithm:"+rev);


        //->logic 2: using stringBuffer
        num = 1024;
        System.out.println("The Original num:"+num);
        StringBuffer sb = new StringBuffer();
        sb.append(num);
        sb.reverse();
        System.out.println("the reverse num using StringBuffer:"+sb);
        String st = sb.toString();
        int res = Integer.parseInt(st);
        System.out.println("the reverse num using stringBuffer and converting to int:"+res);
        
        
        
        //->logic 3: using stringBuilder
        num = 1024;
        System.out.println("The Original num:"+num);
        StringBuilder sbl = new StringBuilder();
        sbl.append(num);
        sbl.reverse();
        System.out.println("the reverse num using stringBuilder:"+sbl);
        String str = sbl.toString();
        res = Integer.parseInt(str);
        System.out.println("the reverse num using stringBuilder and converting to int:"+res);
        
    }
}
