import java.util.Scanner;
  // find the Student result
public class StudentResult
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter student Roll number: ");
        int rollNo = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter Student Name: ");
        String name = scanner.nextLine();
        System.out.println(" Enter the marks in Maths: ");
        int marks1 = scanner.nextInt();
        System.out.println(" Enter the marks in English: ");
        int marks2 = scanner.nextInt();
        System.out.println(" Enter the marks in Science: ");
        int marks3 = scanner.nextInt();

        int total = marks1 + marks2 + marks3;
        double percentage = total / 3.0;
        String passorfail = "pass";
        if (percentage < 45) {
            passorfail = "Fail";
        }
        String division = "";
        String grade = "";

        if (percentage >= 80)
        {  grade = "A+";

        } else if (percentage >= 70)
        {  grade = "B";

        } else if (percentage >= 60)
        {  grade = "C";
        } else {division = "Fail";
        }
         if (percentage >= 50)
         {  grade = "D";
             division = "pass";
         }
        {
            System.out.println("Student Result:");
            System.out.println("Name:" + name);
            System.out.println("Total: " + total);
            System.out.println("Percentage: " + percentage + "%");
            System.out.println("Result: " + passorfail );
            System.out.println("Grade: " + grade);
        }
    }
}
