package week11;

public class ForLoop_01 {
    public static void main(String[] args) {

        int sum = 0;
        for (int number = 1; number <= 10; number++) {
            sum = sum + number;
            System.out.println("รอบที่ " + number + "ผลบวกเท่ากับ " + sum);
        }
        System.out.println("รวมเท่ากับ " + sum);
    }
}