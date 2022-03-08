import java.util.*;

public class Main
{
  public static void primeFactors(int n)
  {
    //i=2 because 2 is smallest prime number
    for(int i=2; i*i<=n; i++)
    {
      while(n%i==0)
      {
        System.out.print(i + " ");
        n = n/i;
      }
    }

    // because last factor is always 1 
    if(n!=1)
    {
      System.out.print(n);
    }
  }

  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    primeFactors(n);
  }
}
