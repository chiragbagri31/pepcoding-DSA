import java.io.*;
import java.util.*;

public class Main 
{
    public static void main(String[] args) throws Exception 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a[][] = new int[n][n];
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                a[i][j] = sc.nextInt();
            }
        }

        int numFound = sc.nextInt();
        int foundI = -1;
        int foundJ = -1;

        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(a[i][j] == numFound)
                {
                    foundI = i;
                    foundJ = j;
                    break;
                }
            }
        }

        if(foundI == -1 && foundJ == -1)
        {
            System.out.print("Not Found");
        }
        else
        {
            System.out.print(foundI + "\n" + foundJ);
        }
       
    }
}
