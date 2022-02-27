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

        int d = sc.nextInt();

        int low = 0;
        int high = n-1;

        int floor = 0;
        int ciel = 0;
        
        while(low<=high)
        {
            int mid = (low + high)/2;
            if(a[mid] == d)
            {
                System.out.print(a[mid] + "\n" + a[mid]);
                break;
            }

            else if(a[mid]>d)
            {
                high = mid - 1;
                ciel = a[mid];
            }
            
            else
            {
                low = mid+1;
                floor = a[mid];
            }
        }

        System.out.println(ciel);
        System.out.println(floor);
    }
}
