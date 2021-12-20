package week11;

import java.util.Scanner;

public class IfElse_Login {
    public static void main(String[] args) {
       Scanner kb = new Scanner(System.in);

       String username_db = "root";
       String password_db = "3333";
  
      
       System.out.print("Enter Username :  ");
       String username = kb.nextLine();
       System.out.print("Enter password :  ");
       String password = kb.nextLine();
 
      
        if (username.equals(username_db)&& (password.equals(password_db))) {
            System.out.println("You art Login");
            
        } else {
            System.out.println("YOu are not Admin");
        }

    }
}
