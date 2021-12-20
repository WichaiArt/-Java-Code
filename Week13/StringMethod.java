package Week13;

public class StringMethod {
    public static void main(String[] args) {
        String name = "Wichai";
        String city = new String ("Nakhon Pathom");
        
        System.out.println(name);
        System.out.println(city);

        // การต่อสริง .concat()

        System.out.println(name + city);
        
        String result = name+city;
        System.out.println(result);
        
        String result2 = name+city+".com";
        System.out.println(result2);

        // concat เเทน +
       
        System.out.println(result2.concat(".ac.th"));
       
        System.out.println(result2+".ac.th");
         
        // หาความยาวของสตริง .Length() 

        System.out.println(name.length()); // ไม่มีstr ใน () ก็ไม่ต้องใส่
        
        int count = name.length(); // ใส่ int ด้วย ตัวเเปร
        System.out.println(count);
       
        // หาตําเเหน่งตัวอักษรในข้อความ .charAT()

        System.out.println(name.charAt(0));

        char Characters = name.charAt(0);
        System.out.println(Characters);

    




 
    }
}
