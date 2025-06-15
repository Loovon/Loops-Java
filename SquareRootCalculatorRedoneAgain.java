import java.util.Scanner;

public class SquareRootCalculatorRedoneAgain
{
   public static void main(String[] args)
   {
      Scanner scanner = new Scanner(System.in);
      int num, i;
      boolean root_found = false;

      System.out.print("\nEnter a number: ");
      num = scanner.nextInt();

      for(i = 1; i <= num / 2; i++)
      {
         if (i * i == num)
         {
            System.out.println("The square root of " + num + " is " + i + ".");
            root_found = true;
         }
      }
      if(root_found == false)
         System.out.println("\nThe square root of " + num + " is not a whole number.");  
    }
}