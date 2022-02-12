import java.util.*;

public class Main
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int left_space = n/2;
        int middle_space = -1;

        for(int i=1; i<=n; i++)
        {
            // for left spaces
            for(int j=1; j<=left_space; j++)
            {
                System.out.print("\t");
            }

            System.out.print("*\t");

            // for middle spaces
            for(int k=1; k<=middle_space; k++)
            {
                System.out.print("\t");
            }

            // prints second star for i=2 to n-1
            if(i!=1 && i!=n)
            {
                System.out.print("*\t");
            }

            //update
            if(i<=n/2)
            {
                middle_space = middle_space + 2;
                left_space = left_space - 1;
            }
            else
            {
                left_space = left_space+1;
                middle_space = middle_space - 2;
            }
            
            System.out.println();
        }
    }
}
