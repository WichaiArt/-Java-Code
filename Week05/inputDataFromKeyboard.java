package Week05;
import java.util.Scanner;
public class inputDataFromKeyboard {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("กรุณาป้อนรหัสนักศึกษา : ");
        String id = kb.nextLine();
       
        System.out.print("กรุณาป้อนชื่อ :");
        String name = kb.nextLine();
        
        System.out.print("กรุณาป้อนปีเกิด : ");
        int year = kb.nextInt();
       
        System.out.print("กรุณาป้อนเกรด : ");
        double gpa = kb.nextDouble();          

        int age = 2564-year; //คำนวณอายุ

        System.out.println("รหัสที่ป้อน คือ "+id); 
        System.out.println("ชื่อ คือ "+name);
        System.out.println("อายุ คือ "+age);
        System.out.println("เกรด คือ "+gpa);
        
        kb.close();

    }
}
