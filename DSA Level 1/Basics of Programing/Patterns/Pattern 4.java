import java.util.*;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i<=n; i++)
        {
            // for spaces
            for(int j=1; j<=i-1; j++)
            {
                System.out.print("\t");
            }

            // for stars
            for(int k=1; k<=n-i+1; k++)
            {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
