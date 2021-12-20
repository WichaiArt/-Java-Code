package Week17;

public class Method_ex03 {
    // method แบบที่ 3 ไม่มีการรับค่าที่ส่งมาจาก main program เเต่ลูกส่งค่าออกคืนเเม่
    public static void main(String[] args) {
       int phone = getPhoneNumber(); //ต้องมีตัวแปรมารองรับ
       System.out.println(getPhoneNumber()); 
       int lucky = 99999;
       int newphone = phone+lucky; // บวกกัน
       System.out.println(phone);
       System.out.println(newphone);
    }
    static int getPhoneNumber(){ 
        //ส่งค่าคืนไม่ต้องใส่ void เเละต้องใส่ชนิดข้อมูลเเทนตำเหน่งของ void
        //static void getPhoneNumber(){ 
        return 614969134; //return ตัวเเปรที่ใช้คืนค่า ไปให้  main

    }
}
