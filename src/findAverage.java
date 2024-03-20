import java.util.Scanner;
  // Find average of five number
public class findAverage
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Any Five Number :- ");
          double sum =0;
          int count = 0;
          for (double i= 0; i < 5; i++) {
              System.out.print("Number " + (i + 1) + " :- ");

              double number = scanner.nextDouble();

              if (number >= 0) {
                  sum += number;
                  count++;

              } else {
                  System.out.println(" Enter a negative number");
                  i--;
              }
          }
          if (count > 0){
              double average = sum / count;
              System.out.println("Average of the five number :- " + average);
          }
          }

    }

