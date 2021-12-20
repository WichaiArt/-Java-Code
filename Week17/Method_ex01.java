package Week17;

public class Method_ex01 {
    public static void main(String[] args) {
        // method แบบที่ 1  ไม่มีการส่งค่าจาก method main  และ ไม่มีการคืนค่ากลับจาก method ลูก
        //การเรียกใช้ method ข้างล่าง
        //ไม่มีการส่งค่ากลับมาให้ main เเล้วจบเลย
       
        openFile();
        playFile();
        pauseFile();
        playFile();
        closeFile();

    }
    //สร้างเมท็อด เพิ่ม จะสร้างบนหรือล่าง main ก็ได้
    public static void openFile(){  // void คือตัวกำหนดไม่ให้มีการส่งค่าไปให้ main
        System.out.println("Open file............................");
        //static ต้องใส่เสมอ
    }
    public static void playFile(){  // void คือตัวกำหนดไม่ให้มีการส่งค่าไปให้ main
        System.out.println("Play Misic............................");
        //static ต้องใส่เสมอ
    }
    public static void pauseFile(){  // void คือตัวกำหนดไม่ให้มีการส่งค่าไปให้ main
        System.out.println("Stop Misic............................");
        //static ต้องใส่เสมอ
    }
    public static void closeFile(){  // void คือตัวกำหนดไม่ให้มีการส่งค่าไปให้ main
        System.out.println("Exit..................................");
        //static ต้องใส่เสมอ
    }


}
