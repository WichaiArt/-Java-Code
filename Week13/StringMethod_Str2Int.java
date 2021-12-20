package Week13;

public class StringMethod_Str2Int { // แปลงตัวอักษรเป็นตัวเลข
    public static void main(String[] args) {
        String s1 = "500";
        String s2 = "300.5";
        int num1 = 100;
        System.out.println(s1 + num1);
        // Integer.parseInt() แปลงสตริงเป็นตัวเลขจำนวนเต็ม

        int num2 = Integer.parseInt(s1);

        double num3 = Double.parseDouble(s2);

        System.out.println(num3 + num1);

    }
}
