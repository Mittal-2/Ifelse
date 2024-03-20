import java.util.Scanner;

public class Eligiblevote
{   // find you are eligible for vote or not
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age :- ");
        int age = scanner.nextInt();
        if (age >= 18) {
            System.out.println( " You are eligible for vote."); //over 18 eligible for vote
        }else {
            System.out.println("You are not eligible for vote."); // under 18 not eligible for vote
        }
    }
}
