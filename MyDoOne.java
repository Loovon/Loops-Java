class MyDoOne
{
   public static void main(String args[])
   {
      int k;

      k = 200;//Initialization

      do
      {
         System.out.println("k = " + k);
	 k = k -10;//updation
      }while(k >= 50); //Condition
   }
}