package Week12;

import java.util.Scanner;

public class Buddhist {
    public static void main(String[] args) {
       
        Scanner kb = new Scanner(System.in);
        while(true){
            System.out.print("กรุณากรอก ค.ศ. ");
            int i = kb.nextInt();
            if (i==0) {
                break;}
            System.out.println("ค.ศ. "+i+" คือ พ.ศ. "+(i+543));
            }System.out.println(" End of Program");
        kb.close();  
    }
}
