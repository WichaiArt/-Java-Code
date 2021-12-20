package Week12;

public class DoWhile01 {
    public static void main(String[] args) {
       //output 1 2 3 4 5
       // ค่าเริ่มต้น เงื่อนไข เพิ่ม - ลด ค่า 
       int i = 1;
        do {
           System.out.print(i+ " ");

          i++; 
        } while (i<=5); // 5 รอบ 
     
        System.out.println();
     
        int j = 1;
        while (j<=5) {
            System.out.print(j+ " ");
            j++;
        }
    }
}
