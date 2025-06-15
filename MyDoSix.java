class MyDoSix
{
   public static void main(String args[])
   {
      int x,y;

      x = 2;
      y = 1;

      do 
      {
        System.out.print( x+" " );
        x = x *3;
        y = y + 1;
       }while(y<=20);
   }
}