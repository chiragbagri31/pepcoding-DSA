import java.util.*;
  
public class Main
{  
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int a = 0, b = 1;
    System.out.println(a + "\n" + b);
    
    for(int i=0; i<n-2; i++)
    {
      int c = a+b;
      System.out.println(c);
      a = b;
      b = c;
    }
  }
}
