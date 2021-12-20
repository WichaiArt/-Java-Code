package Week15;

public class Array_ShowGender {
    public static void main(String[] args) {
        String [] name = {"นายสมปอง","นางสาวสมฤดี","นายสมคิด","นางสาวสมยอม"};
        System.out.println("มีรายชื่อทั้งหมด " + name.length + " คน ประกอบด้วย"); 
        
        for (int i = 0; i < name.length; i++) {
            boolean check = name[i].startsWith("นาย");
            if (check) {
               // System.out.print(name[i]);
                System.out.println((i+1)+". " +name[i]+" ==>"+" เพศชาย");
            } else {
               // System.out.print(name[i]);
                System.out.println((i+1)+". " +name[i]+" ==>"+" เพศหญิง");
            }
        }
    }
}
