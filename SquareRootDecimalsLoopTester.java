import java.util.Scanner;

public class SquareRootDecimalsLoopTester
{
   public static void main(String[] args)
   {
      Scanner scanner = new Scanner(System.in);
      double num, i;
      int times = 1;

      System.out.print("\nEnter a number: ");
      num = scanner.nextDouble();
//1.732050807568
      for(i = 1; i <= num ; i = i + 0.001)
      {
         System.out.println("Iteration number " + times++);
         if (i * i >= num)
         {
            System.out.println("The square root of " + num + " is " + i + ".");
            break;
         }
      }  
    }
}