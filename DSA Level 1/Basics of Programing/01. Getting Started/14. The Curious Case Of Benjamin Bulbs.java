import java.util.*;
  
public class Main
{
  public static void benjaminBulbs(int num)
  {
    for(int i=1; i*i<=num; i++)
    {
      System.out.println(i*i);
    }
  }

  public static void main(String[] args) 
  {
    // write your code here  
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    benjaminBulbs(n);
  }
}
