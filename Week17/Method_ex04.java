package Week17;

public class Method_ex04 {
    // method แบบที่ 4 มีการรับค่าที่ส่งมาจาก main program เเละลูกส่งค่าออกคืนเเม่
    public static void main(String[] args) {
        //plus(6.6,55);
        System.out.println(plus(6.6,55));  
        System.out.println(plus(6.6,155));  
    }
    static double plus(Double a,int b){ // ใส่ double แทน void
        double c = a+b;
        return c;
        
        //return a+b;


    }
    
}
