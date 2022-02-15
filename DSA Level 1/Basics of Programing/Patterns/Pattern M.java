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
                // prints first and last column
                if(j==1 || j==n)
                {
                    System.out.print("*\t");
                }

                // prints spaces from i=2 to n/2+1
                else if(((i==j) || (i+j==n+1)) && i>1 && i<=n/2+1)
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
