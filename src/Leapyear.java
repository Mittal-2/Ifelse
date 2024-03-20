import java.util.Scanner;
  // Input any year and find it leap year or not
public class Leapyear
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        if(isLeapYear(year))
        {    // find id leap year or not
            System.out.println(year + " is a leap year.");
        } else
        {
            System.out.println(year + " is not a leap year.");
        }

        scanner.close();
    }

    public static boolean isLeapYear(int year)
    {
        if(year % 4 == 0)
        {
            if(year % 100 == 0)
            {
                if (year % 400 == 0)
                {
                    return true;
                 } else
                {
                    return false;
                }
                  } else
                 {
                return true;
                 }
                 } else
                  {
                    return false;
        }
    }
}








