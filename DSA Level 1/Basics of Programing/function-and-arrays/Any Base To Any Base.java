import java.util.*;
  
public class Main
{
  // converts decimal base to any base
  public static int destConversion(int decimalNumber, int destBase)
  {
    int temp = decimalNumber;
    int result = 0;
    int power = 0;
    while(temp>0)
    {
      int remaider = temp % destBase;
      result = result + remaider * (int)Math.pow(10, power);
      temp = temp / destBase;
      power++;
    }
    return result;
  }

  // converts any base to decimal base
  public static int decimalConversion(int n, int sourceBase)
  { 
    int temp = n;
    int result = 0;
    int power = 0;
    while(temp>0)
    {
      int last_digit = temp % 10;
      result = result + last_digit * (int)Math.pow(sourceBase , power);
      temp = temp / 10;
      power++;
    }
    return result;
  }

  public static void main(String[] args) 
  {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int sourceBase = scn.nextInt();
    int destBase= scn.nextInt();
    
    int decimalNumber = decimalConversion(n, sourceBase);
    
    int destNumber = destConversion(decimalNumber, destBase);
    System.out.print(destNumber);
  }   
}
