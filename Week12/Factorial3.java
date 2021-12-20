package Week12;

import java.util.Scanner;

public class Factorial3 {
    public static void main(String[] args) {
        
       
        Scanner kb = new Scanner(System.in);
    // Output  4! ==> 4x3x2x1 = 24
        while (true) {
            System.out.print("Enter Number : ");
            int number = kb.nextInt();
            int i = number; //ค่าเริ่มต้น
            int result=1;

            if (number == 0) {
                break;
            }

            System.out.print(number+"! ==> ");   

            while (i >=1) {  //4! ต้องทำ 4 รอบ เงื่อนไข 
                 if (i==number) {  //==ตัวสุดท้าย
                     System.out.print(i);
                 } else {
                     System.out.print("x"+i);
                 } 
                 
                result = result*i;
                 i--;
            }
            System.out.println(" = " + result);
            
        }
        System.out.println("End Of Program");
     
    }
}
