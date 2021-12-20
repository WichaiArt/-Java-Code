package Week15;

public class Array_Basic01 {
    public static void main(String[] args) {
        // การประกาศตัวปรเเบบ อาเรย์
        // แบบที 1 : ประกาศเเบบกำหนดสมาชิก
        int [] number = { 1, 2, 3, 40, 54, 98, 100 }; // ต้องรู้จำนวนข้อมูล

        int size = number.length; // หาความยาว // length(); ของสริง
        System.out.println(size);
        System.out.println(number.length); // แบบไม่เก็บในตัวแปร size //หาความยาว
        // ดึงข้อมูลอออกมาโชว์ โชว์ 40
        System.out.println(number[3]); // การเข้าถึงตำเเหน่งของตัวแปร
        // การเปลี่ยนค่าข้อมูลในตัวแปร
        number[3] = 1000; // เปลี่ยนจาก 40 เป็น 1000
        System.out.println(number[3]);
        System.out.println("===========================");
 
        // แบบที่ 2 : ประกาศเเบบกำหนดขนาด
        // char [] alphabet1;           // ประกาศอาเรย์ 
        // alphabet1 = new char [26];   // สร้างอาเรย์ อยากได้กี่ช่อง

        char [] alphabet = new char [26]; //ประกาศ สร้างพร้อมกัน
        alphabet[0] = 'a';
        alphabet[1] = 'b';
        alphabet[2] = 'c';
        System.out.println(alphabet[2]);
        System.out.println(alphabet[25]);
        System.out.println(alphabet.length);
       // int ผลออกเป็น 0 ด้านบนผลออกว่างเปล่า
        int []num = new int [10];
        System.out.println(num[9]);


    }
}
