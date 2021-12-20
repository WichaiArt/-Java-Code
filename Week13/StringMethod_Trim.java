
package Week13;

public class StringMethod_Trim {  // เอาช่องว่าง หน้า หลังออก
public static void main(String[] args) {
    String fullname = "   Wichai Thongprao   ";
   
    int count = fullname.length();
    System.out.println(count);
    System.out.println("before =>" +fullname);
     
    //.trim() ตัดช่องว่างหน้า หลังออก
   
    String result = fullname.trim();
    System.out.println("after =>"+result);
    System.out.println(result.length());

    // .indexOf() หา เเสดงผลตำแหน่งที่ของตัวอักษร
     System.out.println(fullname.indexOf("ch", 4));

    
     // .toUppreCase()  .toLowerCase() ทำตัวใหญ่ เล็ก ทั้งหมด
     System.out.println(result.toUpperCase());
     System.out.println(result.toLowerCase());

     // .substring() การตัดคำที่ต้องการ
     String uni = "Nakhon Pathom Rajabhat Univrersity";
     System.out.println(uni.substring(0,13));
     

    }
}
