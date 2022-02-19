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
        
        for(int i=0; i<n-1; i++)
        {
            for(int j=0; j<n-1; j++)
            {
                if(a[j]>a[j+1])
                {
                    int temp = a[j];
                    a[j] =  a[j+1];
                    a[j+1] = temp;
                }
            }
        }

        System.out.print(a[n-1] - a[0]);
    }
}
