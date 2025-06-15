import java.util.Scanner;

class MyDoTen
{
   public static void main(String args[])
   {
      Scanner s = new Scanner(System.in);
      int num,origin,out,reverse,x,y;

      System.out.print("Enter the number: ");
      num = s.nextInt();

      origin = num;
      out =0;
      
      do
      {
      y = num % 10;
      out = out * 10 +y;
      num = num / 10;
      
      }while(num > 0);
       
      System.out.print(origin + " in reverse is: " + out);
   }
}