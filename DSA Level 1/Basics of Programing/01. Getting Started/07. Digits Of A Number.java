import java.util.*;
    
public class Main
{
  // to count digits in a Number
  public static int countDigitOfANumber(int n)
  {
    int temp = n;
    int count = 0;
    while(temp>0)
    {
      temp = temp/10;
      count++;
    }
    return count;
  }

  //to print digits in a sequence 
  public static void digitsOfANumber(int n)
  {
    int temp = n;
    int len = countDigitOfANumber(n)-1;
    while(len>=0)
    {
      int digit = temp / (int)Math.pow(10, len);
      System.out.println(digit);
      temp = temp % (int)Math.pow(10, len);
      len--; 
    } 
  }

  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    digitsOfANumber(n);
  }
}
