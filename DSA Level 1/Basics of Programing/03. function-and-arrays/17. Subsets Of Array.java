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

        int twoPower = (int)Math.pow(2, n);

        for(int i=0; i<twoPower; i++)
        {
            int temp = i;
            String str = "";
            
            for(int j=n-1; j>=0; j--)
            {
                int last_digit = temp % 2;
                temp = temp/2;
                
                if(last_digit == 0)
                {
                    str = "-\t" + str;
                }
                else
                {
                    str = a[j] + "\t" + str;
                }
            }
            System.out.println(str);
        }
    }
}
