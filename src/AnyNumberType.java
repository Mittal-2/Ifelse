import java.util.Scanner;
public class AnyNumberType
{
      public static void main(String[] args)
      {
          Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Any Number :-- ");
         double number = scanner.nextDouble();
         if (number > 0)
         { // find out Any number Positive , Negative and zero
             System.out.println("-->Positive.");
         } else if (number <0){
             System.out.println("-->Negative.");
         }else
         {
             System.out.println("--> Zero");
         }
      }
}
