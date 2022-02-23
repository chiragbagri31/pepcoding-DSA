import java.io.*;
import java.util.*;

public class Main
{
    public static void main(String[] args) throws Exception 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        
        for(int i=0; i<n; i++)
        {
            a[i] = sc.nextInt();
        }
        
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<n; i++)
        {
            max = (int)Math.max(max, a[i]);
            min = (int)Math.min(min, a[i]);
        }
        int span = max-min;
        System.out.print(span);
    }
}
