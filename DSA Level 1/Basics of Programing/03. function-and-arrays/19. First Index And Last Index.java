import java.io.*;
import java.util.*;

public class Main
{
    public static int firstIndex(int a[], int n, int d)
    {
        int low = 0;
        int high = n-1;
        int first_index=-1;
        while(low<=high)
        {
            int mid = (low + high)/2;

            if(a[mid] == d)
            {
                first_index = mid;
                high = mid-1;
            }
            else if(a[mid]>d)
            {
                high = mid-1;
            }             
            else
            {
                low = mid+1;
            }
        }
        return first_index;
    }

    public static int lastIndex(int a[], int n, int d)
    {
        int low = 0;
        int high = n-1;
        int last_index=-1;
        while(low<=high)
        {
            int mid = (low + high)/2;

            if(a[mid] == d)
            {
                last_index = mid;
                low = mid+1;
            }
            else if(a[mid]>d)
            {
                high = mid-1;
            }             
            else
            {
                low = mid+1;
            }
        }
        return last_index;
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

        int d = sc.nextInt();

        int first_index = firstIndex(a, n, d);
        System.out.println(first_index);

        int last_index = lastIndex(a, n, d);
        System.out.println(last_index);
    }
}
