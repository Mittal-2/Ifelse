import java.util.Scanner;
public class EmployeeSalary
{// find out basic salary and HRA,TA,DA ,PF and Gross salary
  public static void main(String[] args)
  {
         Scanner scanner = new Scanner(System.in);
          System.out.println("Enter the Employee ID");
            int employeeID = scanner.nextInt();
            scanner.nextLine();
          System.out.println("Enter Employee Name");
             String employeeName = scanner.nextLine();
          System.out.println(" Enter Basic Salary of the employee.");
          double basic = scanner.nextDouble();

          double HRA = 0.10 * basic; // 10% of basic salary
          double DA = 0.8 * basic; // 8% of basic salary
          double TA = 0.09 * basic; // 9% of basic salary
          double PF = 0.20 * basic; // 20% of basic salary
          double grossSalary = basic + HRA + DA + TA + PF;

          System.out.println(" Employee Salary Breakdown ");
          System.out.println( " Basic: " + basic);
          System.out.println(" HRA: " + HRA);
          System.out.println(" DA: " + DA);
          System.out.println( "TA: " + TA);
          System.out.println( "PF: " + PF);
          System.out.println( "GrossSalary: " + grossSalary);
  }
}