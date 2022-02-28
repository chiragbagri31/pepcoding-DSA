import java.io.*;
import java.util.*;

public class Main
{
    // returns maximum element in the array 
    public static int getMaxInArray(int a[], int n)
    {
        int max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++)
        {
            max = Math.max(max, a[i]);
        }
        return max;
    }

    // prints bar chart
    public static void printBarChart(int a[], int n)
    {
        int max = getMaxInArray(a, n);

        for(int height=max; height>0; height--)
        {
            for(int i=0; i<n; i++)
            {
                if(a[i]>=height)
                {
                    System.out.print("*\t");
                }
                else
                {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    } 

    public static void main(String[] args) throws Exception 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for(int i=0; i<n; i++)
        {
            a[i] = sc.nextInt();
        }
         
        printBarChart(a, n);
    }
}
