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

        int minRow = 0;
        int maxRow = n-1;
        int minCol = 0;
        int maxCol = m-1;

        int count = 0;
        int totalElements = n*m;

        while(count<totalElements)
        {
            // left wall
            for(int i=minRow; i<=maxRow && count<totalElements; i++)
            {
                System.out.println(a[i][minCol]);
                count++;
            }
            minCol++;

            // bottom wall
            for(int i=minCol; i<=maxCol && count<totalElements; i++)
            {
                System.out.println(a[maxRow][i]);
                count++;
            }
            maxRow--;

            // right wall
            for(int i=maxRow; i>=minRow && count<totalElements; i--)
            {
                System.out.println(a[i][maxCol]);
                count++;
            }
            maxCol--;

            // top wall
            for(int i=maxCol; i>=minCol && count<totalElements ; i--)
            {
                System.out.println(a[minRow][i]);
                count++;
            }
            minRow++;
        }
    }
}
