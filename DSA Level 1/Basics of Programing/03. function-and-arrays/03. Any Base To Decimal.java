import java.util.*;
  
public class Main
{  
   public static void main(String[] args) 
   {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int d = getValueIndecimal(n, b);
      System.out.println(d);
   }
  
   public static int getValueIndecimal(int n, int b)
   {
      int temp = n;
      int result = 0;
      int bPower = 0;
      
      while(temp>0)
      {  
         int last_digit = temp % 10;
         result = result + last_digit * (int)Math.pow(b, bPower);
         temp = temp / 10;
         bPower++;
      }
      return result;
   }
}
