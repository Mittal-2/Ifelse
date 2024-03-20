import java.util.Scanner;
public class CityName
{     // Enter city name a to f
     public static void main(String[] args)
     {
         Scanner scanner = new Scanner(System.in);
         System.out.println("Enter a alphabet from 'a' to 'f' :");
         char alphabet = scanner.next().charAt(0);
         if (alphabet == 'a')
         {
             System.out.println(" City: Ahmedabad");
         } else if (alphabet == 'b') {
             System.out.println(" City: Baroda");
         } else if (alphabet == 'c') {
             System.out.println(" City: Chennai");
         } else if (alphabet == 'd') {
             System.out.println(" City: Delhi");
         } else if (alphabet == 'e') {
             System.out.println(" City: Edinburgh");
         } else if (alphabet == 'f') {
             System.out.println(" City: Frankfurt");
         }else {
             System.out.println(" Invalid entry");
         }
     }
}
