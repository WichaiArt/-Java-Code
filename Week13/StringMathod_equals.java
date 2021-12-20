package Week13;

public class StringMathod_equals {
    public static void main(String[] args) {
        String lastname1 = "Thongprao";
        String lastname2 = "thongprao";
        
        // เปรียบเทียบ เท่ากัน .equals()

        boolean result = lastname1.equals(lastname2);
        // System.out.println(result);
        
        // เปรียบเทียบ เท่ากัน ไม่สนใจ อักษรเล็ก ใหญ่ .equalsIgnoreCas()
        boolean result2 = lastname1.equalsIgnoreCase(lastname2);
       
        if (result2) {
            System.out.println(lastname1 + " = " + lastname2);
        } else {
            System.out.println(lastname1 + " != " + lastname2);
        }

        



    }
}
