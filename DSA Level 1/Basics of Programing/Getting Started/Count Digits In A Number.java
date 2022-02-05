import java.util.*;
  
public class Main
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int temp = n;
    int count = 0;
    
    while(temp>0)
    {
      int last_digit = temp%10;
      count++;
      temp = temp/10;
    }
    System.out.print(count);
  }
}
