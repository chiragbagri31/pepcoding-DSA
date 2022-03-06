import java.io.*;
import java.util.*;

public class Main 
{
    public static void main(String[] args) throws Exception 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int a[][] = new int[n][m];
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                a[i][j] = sc.nextInt();
            }
        }

        int i=0;
        int j=0; 

        // 0-East, 1-South, 2-West, 3-North
        int direction = 0;

        while(true)
        {
            direction = direction + a[i][j];
            direction = direction % 4;

            if(direction == 0)
            {
                j++;
            }
            else if(direction == 1)
            {
                i++;
            }
            else if(direction == 2)
            {
                j--;
            }
            else
            {
                i--;
            }

            if(i<0 || j<0 || i>=n || j>=m)
            {
                break;
            }
        }

        if(i<0)
        {
            i++;
        }
        else if(j<0)
        {
            j++;
        }
        else if(i>=n)
        {
            i--;
        }
        else if(j>=m)
        {
            j--;
        }
        
        System.out.print(i + "\n" + j);
    }
}
