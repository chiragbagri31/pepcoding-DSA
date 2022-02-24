import java.io.*;
import java.util.*;

public class Main
{
  // prints array
  public static void display(int[] a)
  {
    StringBuilder sb = new StringBuilder();
    for(int val: a)
    {
      sb.append(val + " ");
    }
    System.out.println(sb);
  }

  // swap two elements
  public static void swapElements(int a[], int i, int j)
  {
    int temp = a[i];
    a[i] = a[j];
    a[j] = temp;
  }

  // reverses the array
  public static void reverse(int[] a)
  {
    int start=0; 
    int end = a.length-1;
    while(start<=end)
    {
      swapElements(a, start,end);
      start++;
      end--;
    }
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

    reverse(a);
    display(a);
 }
}
