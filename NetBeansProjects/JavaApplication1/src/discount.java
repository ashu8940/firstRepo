
import java.util.Scanner;

public class discount {
     public static void main(String[] args) {
      Scanner sc =new Scanner(System.in);
        double amount;      
         System.out.println("enter amount ");
         amount =sc.nextDouble();
         if (amount>5000.0) {
            
             System.out.println("discount is 5%");
              }
         else{
             System.out.println("no discount ");  
         }
    
    }
}
