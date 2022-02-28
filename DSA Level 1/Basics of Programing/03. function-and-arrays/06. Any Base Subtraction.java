import java.util.*;
  
public class Main
{
    public static void main(String[] args) 
    {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
    
        int d = getDifference(b, n1, n2);
        System.out.println(d);
    }
    
    public static int getDifference(int b, int n1, int n2)
    {
        int borrow = 0;
		int res = 0;
		int power = 0;
		
		while(n2>0 || n1>0 || borrow>0)
		{
			int sub = (borrow + n2%10) - n1%10;

            n1 = n1/10;
			n2 = n2/10;

			if(sub<0)
			{
				sub = sub + b;
				borrow = -1;
			}
			else
			{
				borrow = 0;
			}
			
			res = res + sub * (int)Math.pow(10, power);
			power++;
		}
        return res;
    }  
}
