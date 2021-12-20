package Week12;

import java.util.Scanner;

public class Factorial2 {
    public static void main(String[] args) {
       Scanner kb = new Scanner(System.in);
       System.out.println("Enter Number : ");
       int number = kb.nextInt();
        // Output  4! ==> 4x3x2x1 = 24

       int i = number; //ค่าเริ่มต้น
       int result=1;

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
}
