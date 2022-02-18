import java.util.*;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n; j++)
            {
                // prints first column and last column stars
                if(j==1 || j==n)
                {
                    System.out.print("*\t");
                }

                // prints stars between i=n/2 & n-1 rows
                else if(((i+j==n+1) || (i==j)) && i>n/2 && i<n)
                {
                    System.out.print("*\t");
                }

                // prints spaces
                else
                {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
