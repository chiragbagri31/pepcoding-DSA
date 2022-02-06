import java.util.*;

public class Main
{
  // To iverse the number
  public static void inverseNumber(int num)
  {
    int temp = num;
    
    int result = 0;
    int last_index = 1;

    while(temp>0)
    {
      int last_digit = temp%10;
      result = result + last_index * (int)Math.pow(10, last_digit-1);
      last_index++;
      temp = temp/10;
    }
    System.out.print(result);
  }

  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    inverseNumber(n);
  }
}
