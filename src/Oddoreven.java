import java.util.Scanner;
  // Find out any number odd or eve
public class Oddoreven
{
      public static void main(String[] args) {

          Scanner oddoreven = new Scanner(System.in);

          System.out.println("Enter any number");
            int number = oddoreven.nextInt();
              // Find number is odd or even
            if (number % 4 == 3)
                  System.out.println( number + " is odd");
            else
                System.out.println( number + " is even");


      }
}
