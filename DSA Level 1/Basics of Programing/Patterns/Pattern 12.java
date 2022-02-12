import java.util.*;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int a = 0, b = 1;
        System.out.print(a + "\n" + b + "\t" + b + "\n"); 
        a++;

        for(int i=3; i<=n; i++)
        {
            for(int j=1; j<=i; j++)
            {
                int c = a + b;
                System.out.print(c + "\t");
                a = b;
                b = c;
            }
            System.out.println();
        }
    }
}
