import java.util.*;

public class Main
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int space = 2*n-3;

        for(int i=1; i<=n; i++)
        {
            // prints first section 
            for(int k=1; k<=i; k++)
            {
                System.out.print(k + "\t");
            }

            // prints spaces
            for(int j=1; j<=space; j++)
            {
                System.out.print("\t");
            }

            // prints second section
            if(i<n)
            {
                for(int k=i; k>0; k--)
                {
                    System.out.print(k + "\t");
                }
            }
            else if(i==n)
            {
                for(int k=i-1; k>0; k--)
                {
                    System.out.print(k + "\t");
                }
            }

            System.out.println();

            if(i<=n-1)
            {
                space = space - 2;
            }
        }
    }
}
