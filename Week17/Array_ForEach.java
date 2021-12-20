package Week17;

public class Array_ForEach {
    public static void main(String[] args) {
        String [] name = {"นายสมปอง","นางสาวสมฤดี","นายสมคิด","นางสาวสมยอม"};
        System.out.println("มีรายชื่อทั้งหมด " + name.length + " คน ประกอบด้วย"); 
        int i=1;
        for (String showName : name) {
            System.out.println(i+". " +showName);
            i++; //วนลูป 
        }

        //บวกตัวเลข
        int [] number = {1,2,3,4,5,6,7,8,9};
        int sum = 0; // ต้องมีชนิดข้อมูลด้วย
        for (int j : number) {
            sum = sum+j; //ตัวแปรสร้างใหม่ 
        }
        System.out.println(sum);
       
       
        // for (int i = 0; i < name.length; i++) {
        //     boolean check = name[i].startsWith("นาย");
        //     if (check) {
        //        // System.out.print(name[i]);
        //         System.out.println((i+1)+". " +name[i]+" ==>"+" เพศชาย");
        //     } else {
        //        // System.out.print(name[i]);
        //         System.out.println((i+1)+". " +name[i]+" ==>"+" เพศหญิง");
        //     }
        // }
    }
}
