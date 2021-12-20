package Week04;
public class GlobalLocalVar {
    public static void main(String[] args) {
        //ตัวแปรเเบบ Global
        int a = 100;
        int b = 200;
        System.out.println(a);
       {
        //ตัวแปรเเบบ Local
          int c = 300;  
          System.out.println(c);
          System.out.println(a);
       }

       //System.out.println(c);
        
    }
    
}
