import java.util.Scanner;
 // Input any two number and then print their interchanged value
public class Interchangedvalue
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
            // Enter any number
        System.out.println("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second number; ");
        int num2 = scanner.nextInt();


        System.out.println("Interchanged values: ");
        System.out.println("First number: " +num1);
        System.out.println("Second number: " + num2);

    }
}
