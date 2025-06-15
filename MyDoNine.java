import java.util.Scanner;

class MyDoNine
{
   public static void main(String args[])
   {
      Scanner s = new Scanner(System.in);
      int num,orgin,count,sum,sumeven,sumodd,x,y,o;

      System.out.print("Enter the number: ");
      num = s.nextInt();
    
      y=0;
      count = 1;  
      x = 0;
      o = 0;
      orgin = num;
      sum = 0;
      sumeven =0;
      sumodd = 0;

      do
      {
      y = num % 10;
      count =count + 1;
      sum = sum + y;
      num = num / 10;
      if(y % 2==0){
         x = x + 1;
         sumeven = sumeven + y;
      }else{
         o = o + 1;
         sumodd = sumodd + y;
         }
      }while(num >0);
      
      System.out.println("The integer: " + orgin + " has " + x + " even digits and " + o + " odd digits making a total of " + count + " digits");
      System.out.println("The sum of the even digits is: " + sumeven);
      System.out.println("The sum of the odd digit is: " + sumodd);
      System.out.println("The sum of all digits is: " + sum);
   }
}