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
                // prints first line
                if((i==1) && (j<=n/2+1 || j==n))
                {
                    System.out.print("*\t");
                } 

                // prints lines from 2 to n/2
                else if((i>1 && i<=n/2) && (j==n/2+1 || j==n))
                {
                   System.out.print("*\t");
                }

                // prints middle line
                else if(i==n/2+1)
                {
                    System.out.print("*\t");
                }

                // prints lines from n/2+1 to n-1
                else if((i>n/2+1 && i<n) && (j==1 || j==n/2+1))
                {
                    System.out.print("*\t");
                } 

                // prints last line
                else if((i==n) && ((j==1) || (j>=n/2+1&&j<=n)))
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
