import java.io.*;
import java.util.*;

public class Main
{
    public static void main(String[] args) throws Exception 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // prints first section
        int space = 0;
        int stars = n;
        for(int i=1; i<=n/2+1; i++)
        {
            for(int j=1; j<=space; j++)
            {
                System.out.print("\t");
            }

            for(int k=1; k<=stars; k++)
            {
                System.out.print("*\t");
            }
            
            space = space + 1;
            stars = stars - 2;
            System.out.println();
        }

        // prints second section
        int left_spaces = n/2-1;
        int middle_spaces = 1;
        for(int i=n/2+2; i<n; i++)
        {
            for(int j=1; j<=left_spaces; j++)
            {
                System.out.print("\t");
            }

            System.out.print("*\t");

            for(int k=1; k<=middle_spaces; k++)
            {
                System.out.print("\t");
            }
            
            System.out.print("*\t");
            
            left_spaces = left_spaces - 1;
            middle_spaces = middle_spaces + 2;
            System.out.println();
        }

        // prints last line
        for(int i=1; i<=n; i++)
        {
            System.out.print("*\t");
        }
    }
}
