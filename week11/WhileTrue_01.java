package week11;

public class WhileTrue_01 {
    public static void main(String[] args) {
        
    
        int count = 1;   // ค่าเริ่มต้น
        while (true) {    // เงื่อนไข <=5 
         System.out.println("รอบที่ "+count+" Java");   // ค่าที่ต้องการเเสดง
            
            count++;    // อัปเดต รอบ
            if (count==100) {
                break;
            }
        }


    }
    
}
