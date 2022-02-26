import java.io.*;
import java.util.*;

public class Main
{
  public static void display(int[] a)
  {
    StringBuilder sb = new StringBuilder();
    for(int val: a)
    {
      sb.append(val + "\n");
    }
    System.out.println(sb);
  }

  public static void inverse(int[] a)
  {
    int n = a.length;

    int[] inverseArray = new int[n];

    for(int i=0; i<n; i++)
    {
      int value = a[i];
      inverseArray[value] = i;
    }
    display(inverseArray);
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
    inverse(a);
 }
}
