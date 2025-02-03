/*
public class exp
{
    public static void main(String args[])
    {
        try
        {
            int n1=10,n2=0;
            float result= n1/n2;
            System.out.println(result);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Error cannot divide");
        }
        finally {
            System.out.println("Executed");
        }
    }
}
*/



class exp
{
   public static void main(String args[])
   {
       int arr[]={1,2,3};
       try
       {
           int a=arr[4];
       }
//       catch (ArrayIndexOutOfBoundsException aexp)
//       {
//           System.out.println("Out of bounds index");
//       }
       catch (ArrayIndexOutOfBoundsException e)
       {
           System.out.println(e);
       }
       finally {
           System.out.println("Running successful");
       }
   }
}