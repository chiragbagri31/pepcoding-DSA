import java.util.*;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int space = n/2;
        int num = 1;

        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=space; j++)
            {
                System.out.print("\t");
            }

            // if i<=3 then print i else print 5-i+1
            int count = (i <= n/2+1) ? i : n-i+1;

            for(int k=1; k<=num; k++)
            { 
                System.out.print(count + "\t");

                // updating
                // if k<=num/2 then increament count by 1 else decreament by 1
                count = (k<=num/2) ? count+1 : count-1;
            }
    
            System.out.println();

            if(i<=n/2)
            {
                space = space -1;
                num = num + 2;
            }
            else
            {
                space = space + 1;
                num = num - 2;
            }
        }
    }
}
