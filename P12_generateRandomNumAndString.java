import java.util.Random;

public class P12_generateRandomNumAndString {
    public static void main(String[] args) {
        
        //->Approch 1: using Random clas
        Random r = new Random();
        int num = r.nextInt(10);//0-9
        double dnum = r.nextDouble(100);//0-99
        
        System.out.println(num);
        System.out.println(dnum);
        


        //->using Math
        System.out.println(Math.random()*10);
    }
}
