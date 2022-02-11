import java.util.*;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int star = n/2+1;
        int space = 1;

        for(int i=1; i<=n; i++)
        {
            // for first stars
            for(int j=1; j<=star; j++)
            {
                System.out.print("*\t");
            }

            // for middle spaces
            for(int k=1; k<=space; k++)
            {
                System.out.print("\t");
            }

            // for last stars
            for(int l=1; l<=star; l++)
            {
                System.out.print("*\t");
            }
            System.out.println();

            if(i<=n/2)
            {
                space = space + 2;
                star = star - 1;
            }
            else
            {
                space = space - 2;
                star = star + 1;
            }
        }
    }
}
