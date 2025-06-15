import java.util.Scanner;

public class SquareRootCalculator 
{
   public static void main(String[] args)
   {
      Scanner scanner = new Scanner(System.in);
      int num, i;

      System.out.print("Enter a number: ");
      num = scanner.nextInt();

      for(i = 1; i <= num ; i++)
      {
         if (i * i == num)
         {
            System.out.println("The square root of " + num + " is " + i + ".");
         }
      }

      System.out.println("The square root of " + num + " is not a whole number.");  
    }
}