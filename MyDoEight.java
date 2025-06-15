import java.util.Scanner;

class MyDoEight
{
   public static void main(String args[])
   {
      int x,y,sum,num1;
      Scanner s = new Scanner(System.in);
    
      System.out.println("Enter the number: ");
      x = s.nextInt();
      
      
      num1 = x;
      sum = 0;
      do 
      {
        y = x % 10;
        sum = sum + y;
        x = x / 10;
       }while(x >0);
      System.out.print("The sum of the digits in the number: " + num1 + " is: " + sum);  
   }
   
}