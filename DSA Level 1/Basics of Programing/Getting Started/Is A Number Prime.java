import java.util.*;
  
public class Main
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
            
    for(int i=0; i<t; i++)
    {
      int n = sc.nextInt();
      numberIsPrime(n);
    }
  }

  public static void numberIsPrime(int n)
  {
    boolean isPrime = true;
    for(int j=2; j*j<=n; j++)
    {
      if((n%j)==0)
      {
        isPrime = false;
        break;
      }
    }
      
    if(isPrime)
    {
      System.out.println("prime");
    }
    else if(!isPrime)
    {
      System.out.println("not prime");
    }
  }
}
