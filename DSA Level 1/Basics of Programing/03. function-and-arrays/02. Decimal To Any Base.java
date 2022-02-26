import java.util.*;
  
public class Main
{
    public static void main(String[] args) 
    {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int dn = getValueInBase(n, b);
      System.out.println(dn);
    }
  
    public static int getValueInBase(int n, int b)
    {
        int temp = n;
        int result = 0;

        int tenPower=0;

        while(temp>0)
        {
           int remainder = temp % b;
           result = result + remainder * (int)Math.pow(10,tenPower);
           temp = temp / b;
           tenPower++;
        }
        return result;
    }
}
