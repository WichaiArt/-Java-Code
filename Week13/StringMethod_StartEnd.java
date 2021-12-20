package Week13;

public class StringMethod_StartEnd {
    public static void main(String[] args) {
        String Fullnam = "นายวิชัย ทองเประ"; // เป็นชาย หรือ หญิง

        // หาตําแหน่งของคำจากด้านหน้า .StartsWith()
        boolean result = Fullnam.startsWith("นาย"); // การเรียกใช้เมท็อด
        // if (result) {
        // System.out.println("เพศชาย");
        // } else {
        // System.out.println("เพศหญิง");
        // }
        if (result) {
            System.out.println(Fullnam + " เป็นเพศชาย");
        } else {
            System.out.println(Fullnam + " เป็นเพศหญิง");
        }

        // หาตําแหน่งของคำ จากหลัง .endsWith()
        String code = "156486432TH";
        boolean result1 = code.endsWith("TH");
        if (result1) {
            System.out.println("สินค้า "+ code + " มาจากประเทศไทย");
        } else {
            System.out.println("สินค้า "+ code + " ไม่ได้มาจากประเทศไทย");
        }

    }
}
