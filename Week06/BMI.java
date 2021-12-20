package Week06;
import java.util.Scanner;
public class BMI { 
   public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("ป้อนนํ้าหนัก (KG) : ");
        double NN = kb.nextDouble();

        System.out.print("ป้อนส่วนสูง (M) : ");
        double H = kb.nextDouble();

        double BMI = NN / H; 
       
        System.out.println("นํ้าหนัก = "+ NN); 
        System.out.println("ส่วนสูง = "+ H);

        System.out.println("ค่าดัชนีมวลกาย (BMI) = " + BMI );

    }
}







