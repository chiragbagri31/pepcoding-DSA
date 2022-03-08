import java.util.*;
   
public class Main
{
  public static int countDigits(int n)
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

  public static void rotateNumber(int n, int k)
  {
    int len = countDigits(n);
    k = (k % len + len) % len;
    int temp = n;
   
    int last_digits = temp % (int)Math.pow(10, k);
    temp = temp / (int)Math.pow(10, k);
    
    int answer = (last_digits * (int)Math.pow(10, len-k)) + temp;
    System.out.print(answer);
  }
   
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();

    rotateNumber(n,k);
  }
}
