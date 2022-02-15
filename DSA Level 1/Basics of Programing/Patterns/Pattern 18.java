import java.util.*;

public class Main
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // for first line
        for(int i=1; i<=n; i++)
        {
            System.out.print("*\t");
        }
        System.out.println();

        // prints first half section
        int left_space = 1;
        int mid_space = n-4;
        for(int i=2; i<=n/2; i++)
        {
            for(int j=1; j<=left_space; j++)
            {
                System.out.print("\t");
            }
            
            System.out.print("*\t");

            for(int k=1; k<=mid_space; k++)
            {
                System.out.print("\t");
            }
            System.out.print("*\t");

            left_space = left_space + 1;
            mid_space = mid_space - 2;
            System.out.println();
        }

        // prints second half section
        int S_left_space = n/2;
        int S_star = 1;
        for(int i=1; i<=n/2+1; i++)
        {
            for(int j=1; j<=S_left_space; j++)
            {
                System.out.print("\t");
            }

            for(int k=1; k<=S_star; k++)
            {
                System.out.print("*\t");
            }

            S_left_space = S_left_space - 1;
            S_star = S_star + 2;
            System.out.println();
        }
    }
}
