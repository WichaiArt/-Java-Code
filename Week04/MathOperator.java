package Week04;
import java.util.Scanner;
public class MathOperator {
    public static void main(String[] args) {
        Scanner kb = new Scanner(String.in);
        
        System.out.print("กรุณาป้อนตัวเลขที่ 1: ");
        double a = kb.nextDouble();
        System.out.print("กรุณาป้อนตัวเลขที่ 2: ");
        double b = kb.nextDouble();
          
        System.out.println("ค่าของตัวแปร a = "+ a);
        System.out.println("ค่าของตัวแปร b = "+ b);
        System.out.println("ผลบวก = " + (a+b));
        System.out.println("ผลลบ = " + (a-b));
        System.out.println("ผลคูน = " + (a*b));
        System.out.println("ผลหาร = " + (a/b));
        System.out.println("ผลหารเอาเศษ = " + (a%b));

        kb.close();
        

    }
}
