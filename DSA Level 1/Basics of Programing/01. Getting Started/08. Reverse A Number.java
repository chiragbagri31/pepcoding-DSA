import java.util.*;
   
public class Main
{
  public static void main(String[] args)
  {
    // write your code here 
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int temp = n;
    while(temp>0)
    {
      int last_digit = temp%10;
      System.out.println(last_digit);
      temp = temp/10;
    }
  }
}
