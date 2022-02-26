import java.io.*;
import java.util.*;

public class Main
{
  public static void display(int[] a)
  {
    StringBuilder sb = new StringBuilder();
    for(int val: a)
    {
      sb.append(val + " ");
    }
    System.out.println(sb);
  }

  public static void swapTwoNumbers(int a[], int startIndex, int endIndex)
  {
    while(startIndex <= endIndex)
    {
      int temp = a[startIndex];
      a[startIndex] = a[endIndex];
      a[endIndex] = temp;
      
      startIndex++;
      endIndex--;
    }
  }

  public static void rotate(int[] a, int k)
  {
    int n = a.length;
    if(k>0)
    {
      k = k % n;
    }
    else if(k<0)
    {
      k = k%n + n;
    }

    swapTwoNumbers(a, 0, n-k-1);
    swapTwoNumbers(a, n-k, n-1);
    swapTwoNumbers(a, 0, n-1);
    display(a);
  }
public static void main(String[] args) throws Exception 
{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++)
    {
       a[i] = Integer.parseInt(br.readLine());
    }
    int k = Integer.parseInt(br.readLine());

    rotate(a, k);
 }
}
