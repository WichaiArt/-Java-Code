package Week17;

import java.security.cert.X509CRL;

public class Method_ex02 {
    // method แบบที่ 2 มีการรับค่าที่ส่งมาจาก main program  เข้าเเต่ไม่มีการส่งค่าออก 
    public static void main(String[] args) {
        display("ดีใจจัง เรียนใกล้จบเเล้ว");
        display("ไปตลาดให้หน่อยลูก");
        Fullname("Suda", 24);
        plus(55, 99);
    }
    static void plus (int num1,int num2){ //ต้องตัวเเปรในวงเล็บด้วย
        int result = num1+num2;
         System.out.println("ผลลัพธ์การบวก เท่ากับ "+ result);
    }
    static void display (String x){ //ต้องตัวเเปรในวงเล็บด้วย
        System.out.println(x);
    }
    static void Fullname (String fname,int age){ //ต้องตัวเเปรในวงเล็บด้วย
        System.out.println(fname +" " + age);
    }

}
