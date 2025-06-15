import java.util.Scanner;

public class SquareRootDecimals 
{
   public static void main(String[] args)
   {
      Scanner scanner = new Scanner(System.in);
      double num, i;

      System.out.print("Enter a number: ");
      num = scanner.nextDouble();

      for(i = 1; i <= num ; i++) {
         i = ( i + num / i) /2;
      }
      {
         if (i * i == num)
         {
            System.out.println("The square root of " + num + " is " + i + ".");
         }
      }  
    }
}